package com.gov.nha.bis.npci.heartbit.service;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import com.gov.nha.bis.security.exception.BisException;
import com.gov.nha.bis.upi.ack.Ack;
import com.gov.nha.bis.upi.ack.ReqHbt;
import com.gov.nha.bis.upi.ack.RespHbt;

public interface HeartBitService {

	public String reqHbtForSignature(ReqHbt reqHbt)  throws BisException;
	
	public Ack authenticate(String reqHbtForSignatureXml,String urlTxn,String uuid) throws BisException;

	public String convertToXML(Object object) throws BisException;

	RespHbt convertToHeartBeatObject(String hbtResXML) throws BisException;

	Document convertXmlToDocument(String authResXML) throws SAXException, IOException, ParserConfigurationException;

}
