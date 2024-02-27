package com.gov.nha.bis.npci.heartbit.service.impl;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.gov.nha.bis.npci.client.HttpClient;
import com.gov.nha.bis.npci.heartbit.service.ResponseVoucherConfirmationService;
import com.gov.nha.bis.security.ds.BisDigitalSignatureService;
import com.gov.nha.bis.security.exception.BisException;
import com.gov.nha.bis.server.util.LogGenerator;
import com.gov.nha.bis.server.util.TranscoderFactory;
import com.gov.nha.bis.server.util.XMLTranscoder;
import com.gov.nha.bis.upi.ack.Ack;
import com.gov.nha.bis.upi.ack.ReqVoucherConfirmation;
import com.gov.nha.bis.upi.ack.RespVoucherConfirmation;


public class ResponseVoucherConfirmationServiceImpl implements ResponseVoucherConfirmationService {


	private static final Logger logger = LoggerFactory.getLogger(ResponseVoucherConfirmationServiceImpl.class);


	private BisDigitalSignatureService bisDigitalSignatureService ;

	@Autowired
	private LogGenerator customLogGenerator ;
	
	private String serverUrl ;
	private String api;
	private String ver;

	private XMLTranscoder t = TranscoderFactory.getDefaultTranscoder();
	
	@Override
	public String reqHbtForSignature(RespVoucherConfirmation reqvou) throws BisException {
		try {
			String xml = convertToXML(reqvou);
			xml = xml.replace("<RespVoucherConfirmation xmlns=","<upi:RespVoucherConfirmation xmlns:upi=");
			xml = xml.replace("</RespVoucherConfirmation>","</upi:RespVoucherConfirmation>");
			
			System.out.println(xml);
			
			Document signedDocument = this.bisDigitalSignatureService.sign(convertXmlToDocument(xml), true);
			String signedAuthXML = convertDocumentToXml(signedDocument);
			return signedAuthXML;
		} catch (Exception e) {
			logger.error("Error while authenticating auth", e);
			throw new BisException("Error while authenticating auth", e);
		} 
	}

	@Override
	public String convertToXML(Object object) throws BisException {
		try {
			return this.t.marshal(object);
		} catch (BisException e) {
			logger.error("Error while marshalling the auth request", (Throwable)e);
			throw new BisException("Error while marshalling the auth request", e);
		} 
	}

	private Ack convertToObject(String hbtResXML) throws BisException {
		try {
			logger.info("convertToObject-------"+hbtResXML);	
			Document inputDocument = convertXmlToDocument(hbtResXML);
			removeSignatureElement(inputDocument);
			return (Ack)this.t.unmarshal(inputDocument.getDocumentElement(), Ack.class);
		} catch (BisException e) {
			logger.error("Error while unmarshalling the auth response", (Throwable)e);
			throw new BisException("Error while unmarshalling the auth response", e);
		} catch (Exception e) {
			logger.error("Error while unmarshalling the auth response", e);
			throw new BisException("Error while unmarshalling the auth response", e);
		} 
	}
	
	@Override
	public ReqVoucherConfirmation convertRespVouResponseToObject(String hbtResXML) throws BisException {
		try {
			logger.info("convertToObject-------"+hbtResXML);	
			Document inputDocument = convertXmlToDocument(hbtResXML);
			removeSignatureElement(inputDocument);
			return (ReqVoucherConfirmation)this.t.unmarshal(inputDocument.getDocumentElement(), ReqVoucherConfirmation.class);
		} catch (BisException e) {
			logger.error("Error while unmarshalling the auth response", (Throwable)e);
			throw new BisException("Error while unmarshalling the auth response", e);
		} catch (Exception e) {
			logger.error("Error while unmarshalling the auth response", e);
			throw new BisException("Error while unmarshalling the auth response", e);
		} 
	}

	private Document convertXmlToDocument(String authResXML) throws SAXException, IOException, ParserConfigurationException {
		Document inputDocument = null;
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setNamespaceAware(true);
		inputDocument = dbf.newDocumentBuilder().parse(new InputSource(new StringReader(authResXML)));
		return inputDocument;
	}

	private String convertDocumentToXml(Document signedDocument) throws TransformerException {
		StringWriter stringWriter = new StringWriter();
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer trans = tf.newTransformer();
		trans.transform(new DOMSource(signedDocument), new StreamResult(stringWriter));
		return stringWriter.getBuffer().toString();
	}

	private void removeSignatureElement(Document inputDocument) {
		Element rootElement = inputDocument.getDocumentElement();
		NodeList nl = inputDocument.getDocumentElement().getChildNodes();
		for (int i = 0; i < nl.getLength(); i++) {
			Node n = nl.item(i);
			if (n.getNodeName().equalsIgnoreCase("signature")) {
				n.getAttributes();
				rootElement.removeChild(n);
			} 
		} 
	}

	public BisDigitalSignatureService getBisDigitalSignatureService() {
		return bisDigitalSignatureService;
	}

	public void setBisDigitalSignatureService(BisDigitalSignatureService bisDigitalSignatureService) {
		this.bisDigitalSignatureService = bisDigitalSignatureService;
	}

	@Override
	public Ack authenticate(String reqHbtForSignatureXml,String urlTxn,String uuid) throws BisException {
		try {
			customLogGenerator.generateLogFile(postUrl(urlTxn), uuid, "VOU_CONF");
			String authResXML = HttpClient.post(postUrl(urlTxn), reqHbtForSignatureXml, null,null);
			customLogGenerator.generateLogFile(authResXML, uuid, "VOU_CONF");
			return convertToObject(authResXML);
		} catch (Exception e) {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			customLogGenerator.generateLogFile(sw.toString(), uuid, "VOU_CONF");
			logger.error("Error while authenticating auth", e);
			throw new BisException("Error while authenticating auth", e);
		} 
	}
	
	private String postUrl(String urlTxn) {
		StringBuffer url = new StringBuffer();
		url.append(this.serverUrl);
		url.append(this.serverUrl.endsWith("/") ? "" : "/");
		url.append(this.api);
		url.append("/");
		url.append(this.ver);
		url.append("/");
		url.append(urlTxn);

		return url.toString();
	}

	public String getServerUrl() {
		return serverUrl;
	}

	public void setServerUrl(String serverUrl) {
		this.serverUrl = serverUrl;
	}

	public String getApi() {
		return api;
	}

	public void setApi(String api) {
		this.api = api;
	}

	public String getVer() {
		return ver;
	}

	public void setVer(String ver) {
		this.ver = ver;
	}

}
