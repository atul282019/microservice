package com.gov.nha.bis.erupi.voucher.service.impl;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.bouncycastle.util.encoders.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.gov.nha.bis.erupi.voucher.confirm.VoucherConfirmationReq;
import com.gov.nha.bis.erupi.voucher.confirm.VoucherConfirmationReqAck;
import com.gov.nha.bis.erupi.voucher.confirm.VoucherConfirmationResp;
import com.gov.nha.bis.erupi.voucher.confirm.VoucherConfirmationRespAck;
import com.gov.nha.bis.erupi.voucher.req.Voucher;
import com.gov.nha.bis.erupi.voucher.req.VoucherCurrentStatusReq;
import com.gov.nha.bis.erupi.voucher.req.VoucherReq;
import com.gov.nha.bis.erupi.voucher.req.VoucherReqAck;
import com.gov.nha.bis.erupi.voucher.req.VoucherRes;
import com.gov.nha.bis.erupi.voucher.req.VoucherResAck;
import com.gov.nha.bis.erupi.voucher.service.NHAVoucherService;
import com.gov.nha.bis.npci.client.HttpClient;
import com.gov.nha.bis.security.exception.BisException;
import com.gov.nha.bis.server.util.LogGenerator;
import com.gov.nha.bis.server.util.TranscoderFactory;
import com.gov.nha.bis.server.util.XMLTranscoder;


public class NHAVoucherServiceImpl implements NHAVoucherService {

	private static final Logger logger = LoggerFactory.getLogger(NHAVoucherServiceImpl.class);

	private XMLTranscoder t = TranscoderFactory.getDefaultTranscoder();
	
	@Autowired
	private LogGenerator customLogGenerator ;
	
	@Override
	public VoucherReq convertToVoucherReq(String hbtResXML) throws BisException {
		try {
			logger.info("convertToObject-------"+hbtResXML);	
			Document inputDocument = convertXmlToDocument(hbtResXML);
			removeSignatureElement(inputDocument);
			return (VoucherReq)this.t.unmarshal(inputDocument.getDocumentElement(), VoucherReq.class);
		} catch (BisException e) {
			logger.error("Error while unmarshalling the auth response", (Throwable)e);
			throw new BisException("Error while unmarshalling the auth response", e);
		} catch (Exception e) {
			logger.error("Error while unmarshalling the auth response", e);
			throw new BisException("Error while unmarshalling the auth response", e);
		} 
	}

	private Voucher convertToVoucher(String hbtResXML) throws BisException {
		try {
			logger.info("convertToObject-------"+hbtResXML);	
			Document inputDocument = convertXmlToDocument(hbtResXML);
			removeSignatureElement(inputDocument);
			return (Voucher)this.t.unmarshal(inputDocument.getDocumentElement(), Voucher.class);
		} catch (BisException e) {
			logger.error("Error while unmarshalling the auth response", (Throwable)e);
			throw new BisException("Error while unmarshalling the auth response", e);
		} catch (Exception e) {
			logger.error("Error while unmarshalling the auth response", e);
			throw new BisException("Error while unmarshalling the auth response", e);
		} 
	}
	
	@Override
	public VoucherReqAck convertToVoucherReqAck(String hbtResXML) throws BisException {
		try {
			logger.info("convertToObject-------"+hbtResXML);	
			Document inputDocument = convertXmlToDocument(hbtResXML);
			removeSignatureElement(inputDocument);
			return (VoucherReqAck)this.t.unmarshal(inputDocument.getDocumentElement(), VoucherReqAck.class);
		} catch (BisException e) {
			logger.error("Error while unmarshalling the auth response", (Throwable)e);
			throw new BisException("Error while unmarshalling the auth response", e);
		} catch (Exception e) {
			logger.error("Error while unmarshalling the auth response", e);
			throw new BisException("Error while unmarshalling the auth response", e);
		} 
	}
	

	@Override
	public VoucherRes convertToVoucherResponse(String hbtResXML) throws BisException {
		try {
			logger.info("convertToObject-------"+hbtResXML);	
			Document inputDocument = convertXmlToDocument(hbtResXML);
			removeSignatureElement(inputDocument);
			return (VoucherRes)this.t.unmarshal(inputDocument.getDocumentElement(), VoucherRes.class);
		} catch (BisException e) {
			logger.error("Error while unmarshalling the auth response", (Throwable)e);
			throw new BisException("Error while unmarshalling the auth response", e);
		} catch (Exception e) {
			logger.error("Error while unmarshalling the auth response", e);
			throw new BisException("Error while unmarshalling the auth response", e);
		} 
	}
	
	public VoucherResAck convertToVoucherResAck(String hbtResXML) throws BisException {
		try {
			logger.info("convertToObject-------"+hbtResXML);	
			Document inputDocument = convertXmlToDocument(hbtResXML);
			removeSignatureElement(inputDocument);
			return (VoucherResAck)this.t.unmarshal(inputDocument.getDocumentElement(), VoucherResAck.class);
		} catch (BisException e) {
			logger.error("Error while unmarshalling the auth response", (Throwable)e);
			throw new BisException("Error while unmarshalling the auth response", e);
		} catch (Exception e) {
			logger.error("Error while unmarshalling the auth response", e);
			throw new BisException("Error while unmarshalling the auth response", e);
		} 
	}
	
	@Override
	public VoucherConfirmationReq convertToVoucherConfirmationReq(String hbtResXML) throws BisException {
		try {
			logger.info("convertToObject-------"+hbtResXML);	
			Document inputDocument = convertXmlToDocument(hbtResXML);
			removeSignatureElement(inputDocument);
			return (VoucherConfirmationReq)this.t.unmarshal(inputDocument.getDocumentElement(), VoucherConfirmationReq.class);
		} catch (BisException e) {
			logger.error("Error while unmarshalling the auth response", (Throwable)e);
			throw new BisException("Error while unmarshalling the auth response", e);
		} catch (Exception e) {
			logger.error("Error while unmarshalling the auth response", e);
			throw new BisException("Error while unmarshalling the auth response", e);
		} 
	}
	
	@Override
	public VoucherConfirmationResp convertToVoucherConfirmationResp(String hbtResXML) throws BisException {
		try {
			logger.info("convertToObject-------"+hbtResXML);	
			Document inputDocument = convertXmlToDocument(hbtResXML);
			removeSignatureElement(inputDocument);
			return (VoucherConfirmationResp)this.t.unmarshal(inputDocument.getDocumentElement(), VoucherConfirmationResp.class);
		} catch (BisException e) {
			logger.error("Error while unmarshalling the auth response", (Throwable)e);
			throw new BisException("Error while unmarshalling the auth response", e);
		} catch (Exception e) {
			logger.error("Error while unmarshalling the auth response", e);
			throw new BisException("Error while unmarshalling the auth response", e);
		} 
	}
	
	@Override
	public VoucherConfirmationRespAck convertToVoucherConfirmationRespAck(String hbtResXML) throws BisException {
		try {
			logger.info("convertToObject-------"+hbtResXML);	
			Document inputDocument = convertXmlToDocument(hbtResXML);
			removeSignatureElement(inputDocument);
			return (VoucherConfirmationRespAck)this.t.unmarshal(inputDocument.getDocumentElement(), VoucherConfirmationRespAck.class);
		} catch (BisException e) {
			logger.error("Error while unmarshalling the auth response", (Throwable)e);
			throw new BisException("Error while unmarshalling the auth response", e);
		} catch (Exception e) {
			logger.error("Error while unmarshalling the auth response", e);
			throw new BisException("Error while unmarshalling the auth response", e);
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
	
	private Document convertXmlToDocument(String authResXML) throws SAXException, IOException, ParserConfigurationException {
		Document inputDocument = null;
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setNamespaceAware(true);
		inputDocument = dbf.newDocumentBuilder().parse(new InputSource(new StringReader(authResXML)));
		return inputDocument;
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

	@Override
	public Voucher getVoucherDecryptData(byte[] voucherData,String dycryptionKey) throws BisException {
		try {
			return convertToVoucher(new Encryption(dycryptionKey).decryptData(new String(Base64.encode(voucherData))));
		} catch (Exception e) {
			logger.error("Error while unmarshalling the auth response", (Throwable)e);
			throw new BisException("Error while unmarshalling the auth response", e);
		}
	}
	
	@Override
	public String getVoucherEncyptData(String data,String encryptionKey) throws BisException {
		try {
			return (new Encryption(encryptionKey).encrypt(data));
		} catch (Exception e) {
			logger.error("Error while unmarshalling the auth response", (Throwable)e);
			throw new BisException("Error while unmarshalling the auth response", e);
		}
	}	
	
	@Override
	public VoucherResAck authenticate(String xml,String urlTxn,String uuid,String token) throws BisException {
		try {
			customLogGenerator.generateLogFile(urlTxn, uuid, "NHA_API_CREATE_VOUCHER");
			String authResXML = HttpClient.post(urlTxn, xml, null,token);
			customLogGenerator.generateLogFile(authResXML, uuid, "NHA_API_CREATE_VOUCHER");
			return convertToVoucherResAck(authResXML);
		} catch (Exception e) {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			customLogGenerator.generateLogFile(sw.toString(), uuid, "NHA_API_CREATE_VOUCHER");
			logger.error("Error while authenticating auth", e);
			throw new BisException("Error while authenticating auth", e);
		} 
	}
	
	
	@Override
	public VoucherConfirmationReqAck authenticateConfirmation(String xml,String urlTxn,String uuid,String token) throws BisException {
		try {
			customLogGenerator.generateLogFile(urlTxn, uuid, "NHA_API_CREATE_VOUCHER");
			String authResXML = HttpClient.post(urlTxn, xml, null,token);
			customLogGenerator.generateLogFile(authResXML, uuid, "NHA_API_CREATE_VOUCHER");
			return convertToVoucherConfimationReqAck(authResXML);
		} catch (Exception e) {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			customLogGenerator.generateLogFile(sw.toString(), uuid, "NHA_API_CREATE_VOUCHER");
			logger.error("Error while authenticating auth", e);
			throw new BisException("Error while authenticating auth", e);
		} 
	}
	
	public VoucherConfirmationReqAck convertToVoucherConfimationReqAck(String hbtResXML) throws BisException {
		try {
			logger.info("convertToObject-------"+hbtResXML);	
			Document inputDocument = convertXmlToDocument(hbtResXML);
			removeSignatureElement(inputDocument);
			return (VoucherConfirmationReqAck)this.t.unmarshal(inputDocument.getDocumentElement(), VoucherConfirmationReqAck.class);
		} catch (BisException e) {
			logger.error("Error while unmarshalling the auth response", (Throwable)e);
			throw new BisException("Error while unmarshalling the auth response", e);
		} catch (Exception e) {
			logger.error("Error while unmarshalling the auth response", e);
			throw new BisException("Error while unmarshalling the auth response", e);
		} 
	}

	@Override
	public VoucherCurrentStatusReq convertToVoucherCurrentStatusReq(String req) throws BisException {
		try {
			logger.info("convertToObject-------"+req);	
			Document inputDocument = convertXmlToDocument(req);
			removeSignatureElement(inputDocument);
			return (VoucherCurrentStatusReq)this.t.unmarshal(inputDocument.getDocumentElement(), VoucherCurrentStatusReq.class);
		} catch (BisException e) {
			logger.error("Error while unmarshalling the auth response", (Throwable)e);
			throw new BisException("Error while unmarshalling the auth response", e);
		} catch (Exception e) {
			logger.error("Error while unmarshalling the auth response", e);
			throw new BisException("Error while unmarshalling the auth response", e);
		} 
	}
	
}
