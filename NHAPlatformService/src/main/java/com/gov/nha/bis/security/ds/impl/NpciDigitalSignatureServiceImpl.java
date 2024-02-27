package com.gov.nha.bis.security.ds.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

import javax.xml.crypto.MarshalException;
import javax.xml.crypto.dsig.XMLSignature;
import javax.xml.crypto.dsig.XMLSignatureException;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import javax.xml.crypto.dsig.dom.DOMValidateContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import com.gov.nha.bis.security.ds.NpciDigitalSignatureService;
import com.gov.nha.bis.security.exception.BisException;

public class NpciDigitalSignatureServiceImpl implements NpciDigitalSignatureService {
	static {
		Security.addProvider((Provider)new BouncyCastleProvider());
	}

	private static Log logger = LogFactory.getLog(NpciDigitalSignatureServiceImpl.class);


	private Certificate cert;

	public NpciDigitalSignatureServiceImpl(String keyStoreFil) throws BisException, CertificateException, FileNotFoundException {

		CertificateFactory factory = CertificateFactory.getInstance("X.509");
		FileInputStream fis = new FileInputStream(keyStoreFil);
		cert = factory.generateCertificate(fis);
	}


	public boolean verify(Document xmlDoc) {
		try {

			PublicKey publicKey = cert.getPublicKey();
			NodeList nl = xmlDoc.getElementsByTagNameNS("http://www.w3.org/2000/09/xmldsig#", "Signature");
			if (nl.getLength() == 0) {
				logger.info("Cannot find Signature element");
				return false;
			}
			XMLSignatureFactory fac = XMLSignatureFactory.getInstance("DOM");

			DOMValidateContext valContext = new DOMValidateContext(publicKey, nl.item(0));
			XMLSignature signature = fac.unmarshalXMLSignature(valContext);

			return signature.validate(valContext);

		}
		catch (MarshalException mExp) {
			return false;
		} catch (XMLSignatureException xmlExp) {
			return false;
		}
	}

	public NpciDigitalSignatureServiceImpl() {}


	public Certificate getCert() {
		return cert;
	}


	public void setCert(Certificate cert) {
		this.cert = cert;
	}
	
	
}
