package com.gov.nha.bis.security.ds.impl;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Security;
import java.security.Signature;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.RSAPublicKeySpec;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import javax.xml.crypto.MarshalException;
import javax.xml.crypto.XMLStructure;
import javax.xml.crypto.dom.DOMStructure;
import javax.xml.crypto.dsig.Reference;
import javax.xml.crypto.dsig.SignedInfo;
import javax.xml.crypto.dsig.XMLSignature;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import javax.xml.crypto.dsig.dom.DOMSignContext;
import javax.xml.crypto.dsig.dom.DOMValidateContext;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;
import javax.xml.crypto.dsig.keyinfo.X509Data;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.x509.X509Name;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.openssl.PEMReader;
import org.bouncycastle.openssl.PasswordFinder;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.gov.nha.bis.security.CertificateTrustValidator;
import com.gov.nha.bis.security.RSAPublicKeyProvider;
import com.gov.nha.bis.security.SignatureKeyProvider;
import com.gov.nha.bis.security.ds.TmsDigitalSignatureService;
import com.gov.nha.bis.security.exception.BisException;
import com.gov.nha.bis.security.exception.CertificateDateValidityException;
import com.gov.nha.bis.security.exception.CertificateNotPresentException;
import com.gov.nha.bis.security.exception.KeyExpiredException;
import com.gov.nha.bis.security.exception.KeyNotYetValidException;
import com.gov.nha.bis.security.exception.UnknownOrganizationInCertificateException;

public class TmsDigitalSignatureServiceImpl implements TmsDigitalSignatureService {
	  static {
		    Security.addProvider((Provider)new BouncyCastleProvider());
		  }
		  
		  private static Log logger = LogFactory.getLog(TmsDigitalSignatureServiceImpl.class);
		  
		  private static final String SIGN_KEY_USAGE = "1";
		  
		  private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss.S";
		  
		  private static final char[] TRUST_STORE_PWD = "changeit".toCharArray();
		  
		  private static final String MEC_TYPE = "DOM";
		  
		  private static final String WHOLE_DOC_URI = "";
		  
		  private static final String KEY_STORE_TYPE = "PKCS12";
		  
		  private static final String SIGNATURE_TAG = "Signature";
		  
		  private static final String KEYINFO_TAG = "KeyInfo";
		  
		  private static final String SIGNATURE_FILE_NAME = "signature/Signature.sf";
		  
		  private static final String SIGNATURE_ALGO = "SHA1withRSA";
		  
		  private static final String BC_JCE_PROVIDER = "BC";
		  
		  private static final String BASE_ALGORITHM = "RSA";
		  
		  private static final String CERTIFICATE_TYPE = "X.509";
		  
		  private static final String ORG_NAME_OID = "2.5.4.10";
		  
		  private String keyStoreFile;
		  
		  private char[] keyStorePassword;
		  
		  private String alias;
		  
		  private String trustStore;
		  
		  private char[] trustStorePassword;
		  
		  private KeyStore.PrivateKeyEntry keyEntry;
		  
		  private KeyStore keystore = null;
		  
		  private boolean validateTrustStore = true;
		  
		  private SignatureKeyProvider keyProvider;
		  
		  private RSAPublicKeyProvider publicKeyProvider;
		  
		  private CertificateTrustValidator certificateTrustValidator;
		  
		  public TmsDigitalSignatureServiceImpl(String keyStoreFile, char[] keyStorePassword, String keyAlias) throws BisException {
		    this(keyStoreFile, keyStorePassword, keyAlias, null, null);
		  }
		  
		  public TmsDigitalSignatureServiceImpl(String keyStoreFile, char[] keyStorePassword, String keyAlias, String trustStore, char[] trustStorePassword) throws BisException {
		    this.keyStoreFile = keyStoreFile;
		    this.keyStorePassword = keyStorePassword;
		    this.alias = keyAlias;
		    if (this.keyStoreFile != null)
		      this.keyEntry = getKeyFromKeyStore(); 
		    this.trustStore = trustStore;
		    this.trustStorePassword = trustStorePassword;
		  }
		  
		  public TmsDigitalSignatureServiceImpl(char[] keyStorePassword) throws BisException {
		    this.keyStorePassword = keyStorePassword;
		  }
		  
		  public SignatureKeyProvider getKeyProvider() {
		    return this.keyProvider;
		  }
		  
		  public void setKeyProvider(SignatureKeyProvider keyProvider) throws BisException {
		    this.keyProvider = keyProvider;
		    this.keyEntry = getKeyFromDB();
		  }
		  
		  public void setPublicKeyProvider(RSAPublicKeyProvider publicKeyProvider) {
		    this.publicKeyProvider = publicKeyProvider;
		  }
		  
		  public void setValidateTrustStore(boolean validateTrustStore) {
		    this.validateTrustStore = validateTrustStore;
		  }
		  
		  public Document sign(Document xmlDoc, boolean includeKeyInfo) throws BisException {
		    try {
		      XMLSignatureFactory fac = XMLSignatureFactory.getInstance("DOM");
		      Reference ref = fac.newReference("", fac.newDigestMethod("http://www.w3.org/2001/04/xmlenc#sha256", null), 
		          Collections.singletonList(fac.newTransform("http://www.w3.org/2000/09/xmldsig#enveloped-signature", (TransformParameterSpec)null)), null, null);
		      SignedInfo sInfo = fac.newSignedInfo(fac.newCanonicalizationMethod("http://www.w3.org/TR/2001/REC-xml-c14n-20010315", (C14NMethodParameterSpec)null), fac
		          .newSignatureMethod("http://www.w3.org/2000/09/xmldsig#rsa-sha1", null), 
		          Collections.singletonList(ref));
		      validateKeyEntry();
		      X509Certificate x509Cert = (X509Certificate)this.keyEntry.getCertificate();
		      KeyInfo kInfo = getKeyInfo(x509Cert, fac);
		      DOMSignContext dsc = new DOMSignContext(this.keyEntry.getPrivateKey(), xmlDoc.getDocumentElement());
		      XMLSignature signature = fac.newXMLSignature(sInfo, includeKeyInfo ? kInfo : null);
		      signature.sign(dsc);
		      Node node = dsc.getParent();
		      return node.getOwnerDocument();
		    } catch (GeneralSecurityException geExp) {
		      throw new BisException(geExp);
		    } catch (Exception exp) {
		      throw new BisException(exp);
		    } 
		  }
		  
		  public Document sign(Document xmlDoc) throws BisException {
		    return sign(xmlDoc, true);
		  }
		  
		  public boolean verify(Document xmlDoc) throws BisException {
		    return verify(xmlDoc, (String)null);
		  }
		  
		  public boolean verify(Document xmlDoc, String orgName) throws BisException {
		    ArrayList<String> l = new ArrayList<>();
		    if (orgName != null)
		      l.add(orgName); 
		    return verify(xmlDoc, l);
		  }
		  
		  public boolean verify(Document xmlDoc, List<String> orgNames) throws BisException {
		    Certificate cert = getCertFromXMLDoc(xmlDoc);
		    return verify(xmlDoc, cert, orgNames);
		  }
		  
		  public boolean verify(Document xmlDoc, String certificateFilePath, String orgName) throws BisException {
		    ArrayList<String> l = new ArrayList<>();
		    l.add(orgName);
		    return verify(xmlDoc, certificateFilePath, l);
		  }
		  
		  public boolean verify(Document xmlDoc, String certificateFilePath, List<String> orgNames) throws BisException {
		    try {
		      Certificate certificate = getCertificateFromFile(certificateFilePath);
		      return verify(xmlDoc, certificate, orgNames);
		    } catch (IOException ioe) {
		      throw new BisException(ioe.getMessage());
		    } catch (GeneralSecurityException gse) {
		      throw new BisException(gse.getMessage());
		    } 
		  }
		  
		  public boolean verify(Document xmlDoc, int orgCode) throws BisException {
		    PublicKey publicKey = getPublicKey(Integer.toString(orgCode));
		    return verify(xmlDoc, publicKey);
		  }
		  
		  private boolean verify(Document xmlDoc, Certificate certificate, List<String> orgNames) throws BisException {
		    if (certificate == null)
		      throw new CertificateNotPresentException("Could not find keyInfo element in Signature"); 
		    validateCA(certificate);
		    validateOrgName(certificate, orgNames);
		    validateCertDates(certificate);
		    return verify(xmlDoc, certificate.getPublicKey());
		  }
		  
		  private boolean verify(Document xmlDoc, PublicKey publicKey) throws BisException {
		    try {
		      NodeList nl = xmlDoc.getElementsByTagNameNS("http://www.w3.org/2000/09/xmldsig#", "Signature");
		      if (nl.getLength() == 0)
		        throw new IllegalArgumentException("Cannot find Signature element"); 
		      XMLSignatureFactory fac = XMLSignatureFactory.getInstance("DOM");
		      DOMValidateContext valContext = new DOMValidateContext(publicKey, nl.item(0));
		      XMLSignature signature = fac.unmarshalXMLSignature(valContext);
		      return signature.validate(valContext);
		    } catch (Exception e) {
		      logger.error("Error while verifying digital siganature", e);
		      return false;
		    } 
		  }
		  
		  private void validateCertDates(Certificate certificate) throws CertificateDateValidityException {
		    Date notBefore = ((X509Certificate)certificate).getNotBefore();
		    Date notAfter = ((X509Certificate)certificate).getNotAfter();
		    Date now = new Date();
		    if (notBefore.getTime() > now.getTime() || now.getTime() > notAfter.getTime())
		      throw new CertificateDateValidityException("Organization Name does not match."); 
		  }
		  
		  private void validateCA(Certificate x509Cert) throws BisException {
		    if (!this.validateTrustStore)
		      return; 
		    this.certificateTrustValidator.validateCA(x509Cert);
		  }
		  
		  private void validateOrgName(Certificate x509Cert, List<String> orgNames) throws UnknownOrganizationInCertificateException {
		    if (orgNames != null && !orgNames.isEmpty()) {
		      boolean matchFound = false;
		      List<String> certOrgNames = getCertificateOrgName(x509Cert);
		      for (String orgName : orgNames) {
		        for (String certOrgName : certOrgNames) {
		          try {
		            if (certOrgName.trim().toLowerCase().equalsIgnoreCase(orgName.trim().toLowerCase())) {
		              matchFound = true;
		              logger.debug("Matching org name in '" + orgName + "' with cert org name '" + certOrgName + "'");
		              break;
		            } 
		          } catch (Exception e) {
		            logger.error("Exception while matching org name and cert name", e);
		          } 
		        } 
		        if (matchFound)
		          break; 
		      } 
		      if (!matchFound)
		        throw new UnknownOrganizationInCertificateException("Organization Name does not match."); 
		    } 
		  }
		  
		  private List<String> getCertificateOrgName(Certificate x509Cert) {
		    X509Name name = new X509Name(((X509Certificate)x509Cert).getSubjectDN().getName());
		    List<String> orgNames = new ArrayList<>();
		    Vector<String> names = name.getValues(new DERObjectIdentifier("2.5.4.10"));
		    for (String n : names) {
		      if (StringUtils.isNotBlank(n))
		        orgNames.add(n.trim().toLowerCase()); 
		    } 
		    return orgNames;
		  }
		  
		  private Certificate getCertFromXMLDoc(Document xmlDoc) throws BisException {
		    NodeList keyInfoNode = xmlDoc.getElementsByTagNameNS("http://www.w3.org/2000/09/xmldsig#", "KeyInfo");
		    if (keyInfoNode.getLength() == 0)
		      return null; 
		    try {
		      KeyInfoFactory keyInfoFactory = KeyInfoFactory.getInstance("DOM");
		      KeyInfo keyInfo = keyInfoFactory.unmarshalKeyInfo(new DOMStructure(keyInfoNode.item(0)));
		      Iterator<XMLStructure> ki = keyInfo.getContent().iterator();
		      while (ki.hasNext()) {
		        XMLStructure info = ki.next();
		        if (!(info instanceof X509Data))
		          continue; 
		        X509Data x509Data = (X509Data)info;
		        Iterator xi = x509Data.getContent().iterator();
		        while (xi.hasNext()) {
		          Object o = xi.next();
		          if (!(o instanceof X509Certificate))
		            continue; 
		          X509Certificate x509 = (X509Certificate)o;
		          return x509;
		        } 
		      } 
		      throw new BisException("Certificate not found in XML Document.");
		    } catch (MarshalException me) {
		      throw new BisException(me);
		    } 
		  }
		  
		  private KeyStore getTrustStore() throws BisException {
		    FileInputStream is = null;
		    try {
		      if (this.keystore == null) {
		        is = new FileInputStream(this.trustStore);
		        this.keystore = KeyStore.getInstance(KeyStore.getDefaultType());
		        this.keystore.load(is, this.trustStorePassword);
		      } 
		    } catch (IOException ioe) {
		      throw new BisException(ioe.getMessage());
		    } catch (GeneralSecurityException gse) {
		      throw new BisException(gse.getMessage());
		    } finally {
		      if (is != null)
		        try {
		          is.close();
		        } catch (IOException e) {
		          logger.error("Unable to close file strea of Trust store", e);
		        }  
		    } 
		    return this.keystore;
		  }
		  
		  private void validateKeyEntry() throws BisException {
		    if (this.keyEntry == null)
		      throw new BisException("key entry can not be null."); 
		  }
		  
		  private KeyStore.PrivateKeyEntry getKeyFromKeyStore() throws BisException {
		    FileInputStream keyFileStream = null;
		    try {
		      KeyStore ks = KeyStore.getInstance("PKCS12");
		      keyFileStream = new FileInputStream(this.keyStoreFile);
		      ks.load(keyFileStream, this.keyStorePassword);
		      if (this.alias == null || this.alias.length() == 0)
		        throw new BisException("Alias can not be null or blank."); 
		      KeyStore.PrivateKeyEntry entry = (KeyStore.PrivateKeyEntry)ks.getEntry(this.alias, new KeyStore.PasswordProtection(this.keyStorePassword));
		      if (entry == null)
		        throw new BisException("Key not found for the given alias."); 
		      keyFileStream.close();
		      return entry;
		    } catch (KeyStoreException ksExp) {
		      throw new BisException(ksExp);
		    } catch (IOException ioe) {
		      throw new BisException(ioe);
		    } catch (GeneralSecurityException gsExp) {
		      throw new BisException(gsExp);
		    } finally {
		      if (keyFileStream != null)
		        try {
		          keyFileStream.close();
		        } catch (IOException e) {
		          logger.error("Error while closing file stream", e);
		        }  
		    } 
		  }
		  
		  private KeyStore.PrivateKeyEntry getKeyFromDB() throws BisException {
		    PEMReader reader = null;
		    try {
		      String privateKeyStore = this.keyProvider.getPrivateKeyStore();
		      if (privateKeyStore == null)
		        throw new BisException("Not able to retrieve key store from DB."); 
		      reader = new PEMReader(new StringReader(privateKeyStore), new KeyStorePwdProvider(this.keyStorePassword));
		      X509Certificate cert = (X509Certificate)reader.readObject();
		      KeyPair keyPair = (KeyPair)reader.readObject();
		      PrivateKey key = keyPair.getPrivate();
		      return new KeyStore.PrivateKeyEntry(key, new Certificate[] { cert });
		    } catch (IOException ioe) {
		      throw new BisException(ioe);
		    } finally {
		      try {
		        if (reader != null)
		          reader.close(); 
		      } catch (IOException ioe) {
		        throw new BisException(ioe);
		      } 
		    } 
		  }
		  
		  private PublicKey getPublicKey(String orgCode) throws BisException {
		    if (this.publicKeyProvider == null)
		      throw new BisException("Key provider has to be provided."); 
		    List<String> publicKeyDataList = this.publicKeyProvider.getPublicKey(orgCode, "1");
		    if (publicKeyDataList == null)
		      throw new BisException("No Public key found or more than one record found."); 
		    try {
		      checkKeyValidity(publicKeyDataList);
		      KeyFactory kf = KeyFactory.getInstance("RSA", "BC");
		      RSAPublicKeySpec pubSpec = new RSAPublicKeySpec(new BigInteger(publicKeyDataList.get(0), 16), new BigInteger(publicKeyDataList.get(1), 16));
		      return kf.generatePublic(pubSpec);
		    } catch (GeneralSecurityException gse) {
		      throw new BisException(gse.getMessage());
		    } 
		  }
		  
		  private void checkKeyValidity(List<String> publicKeyData) throws KeyExpiredException, KeyNotYetValidException, BisException {
		    try {
		      Date notBefore = convertStringToDate(publicKeyData.get(2));
		      Date notAfter = convertStringToDate(publicKeyData.get(3));
		      if (!notBefore.before(new Date()))
		        throw new KeyNotYetValidException("Key Not Yet Valid."); 
		      if (!notAfter.after(new Date()))
		        throw new KeyExpiredException("Key expired."); 
		    } catch (ParseException pe) {
		      throw new BisException("Not able to validate key", pe);
		    } 
		  }
		  
		  private Date convertStringToDate(String dateStr) throws ParseException {
		    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
		    return sdf.parse(dateStr);
		  }
		  
		  private KeyInfo getKeyInfo(X509Certificate cert, XMLSignatureFactory fac) {
		    KeyInfoFactory kif = fac.getKeyInfoFactory();
		    List x509Content = new ArrayList();
		    x509Content.add(cert.getSubjectX500Principal().getName());
		    x509Content.add(cert);
		    X509Data xd = kif.newX509Data(x509Content);
		    return kif.newKeyInfo(Collections.singletonList(xd));
		  }
		  
		  public OutputStream sign(InputStream zipFile) throws BisException {
		    ZipInputStream zin = null;
		    ZipOutputStream zos = null;
		    try {
		      byte[] buf = new byte[1024];
		      zin = new ZipInputStream(zipFile);
		      ByteArrayOutputStream arrayStream = new ByteArrayOutputStream();
		      zos = new ZipOutputStream(arrayStream);
		      Signature sign = Signature.getInstance("SHA1withRSA", "BC");
		      validateKeyEntry();
		      PrivateKey privateKey = this.keyEntry.getPrivateKey();
		      sign.initSign(privateKey);
		      for (ZipEntry entry = zin.getNextEntry(); entry != null; entry = zin.getNextEntry()) {
		        String name = entry.getName();
		        if (!"signature/Signature.sf".equals(name)) {
		          zos.putNextEntry(new ZipEntry(name));
		          int len;
		          while ((len = zin.read(buf)) > 0) {
		            sign.update(buf, 0, len);
		            zos.write(buf, 0, len);
		          } 
		        } 
		      } 
		      zos.putNextEntry(new ZipEntry("signature/Signature.sf"));
		      zos.write(sign.sign());
		      zos.closeEntry();
		      return arrayStream;
		    } catch (IOException ioe) {
		      throw new BisException(ioe.getMessage());
		    } catch (GeneralSecurityException gse) {
		      throw new BisException(gse.getMessage());
		    } finally {
		      try {
		        if (zin != null)
		          zin.close(); 
		        if (zos != null)
		          zos.close(); 
		      } catch (Exception e) {
		        logger.error("Exception while closing stream", e);
		      } 
		    } 
		  }
		  
		  public int verify(InputStream zipFile, String certificateFile) throws BisException {
		    ZipInputStream zin = null;
		    try {
		      zin = new ZipInputStream(zipFile);
		      byte[] buf = new byte[1024];
		      byte[] signBytes = new byte[128];
		      Signature sign = Signature.getInstance("SHA1withRSA", "BC");
		      sign.initVerify(getCertificateFromFile(certificateFile).getPublicKey());
		      boolean signatureExists = false;
		      for (ZipEntry entry = zin.getNextEntry(); entry != null; entry = zin.getNextEntry()) {
		        String name = entry.getName();
		        if ("signature/Signature.sf".equals(name)) {
		          zin.read(signBytes, 0, signBytes.length);
		          signatureExists = true;
		        } else {
		          int len;
		          while ((len = zin.read(buf)) > 0)
		            sign.update(buf, 0, len); 
		        } 
		      } 
		      if (!signatureExists)
		        return 0; 
		      boolean result = sign.verify(signBytes);
		      if (result)
		        return 1; 
		      return 2;
		    } catch (IOException ioe) {
		      throw new BisException(ioe.getMessage());
		    } catch (GeneralSecurityException gse) {
		      throw new BisException(gse.getMessage());
		    } finally {
		      try {
		        if (zin != null)
		          zin.close(); 
		      } catch (Exception e) {
		        logger.error("Error while closing stream", e);
		      } 
		    } 
		  }
		  
		  private X509Certificate getCertificateFromFile(String certificateFile) throws GeneralSecurityException, IOException {
		    FileInputStream fis = null;
		    try {
		      CertificateFactory certFactory = CertificateFactory.getInstance("X.509", "BC");
		      fis = new FileInputStream(certificateFile);
		      return (X509Certificate)certFactory.generateCertificate(fis);
		    } finally {
		      if (fis != null)
		        fis.close(); 
		    } 
		  }
		  
		  private static class KeyStorePwdProvider implements PasswordFinder {
		    private final char[] keyStorePwd;
		    
		    KeyStorePwdProvider(char[] keyStorePwd) {
		      this.keyStorePwd = keyStorePwd;
		    }
		    
		    public char[] getPassword() {
		      return this.keyStorePwd;
		    }
		  }
		  
		  public void setTrustStore(String trustStore) {
		    this.trustStore = trustStore;
		  }
		  
		  public void setTrustStorePassword(char[] trustStorePassword) {
		    this.trustStorePassword = trustStorePassword;
		  }
		  
		  public void setCertificateTrustValidator(CertificateTrustValidator certificateTrustValidator) {
		    this.certificateTrustValidator = certificateTrustValidator;
		  }
		  
		  public TmsDigitalSignatureServiceImpl() {}
}
