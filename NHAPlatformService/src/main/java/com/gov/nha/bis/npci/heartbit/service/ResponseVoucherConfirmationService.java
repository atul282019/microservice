package com.gov.nha.bis.npci.heartbit.service;

import com.gov.nha.bis.security.exception.BisException;
import com.gov.nha.bis.upi.ack.Ack;
import com.gov.nha.bis.upi.ack.ReqVoucherConfirmation;
import com.gov.nha.bis.upi.ack.RespVoucherConfirmation;

public interface ResponseVoucherConfirmationService {

	
	public String reqHbtForSignature(RespVoucherConfirmation reqHbt)  throws BisException;
	
	public Ack authenticate(String reqHbtForSignatureXml,String urlTxn,String uuid) throws BisException;
	
	public String convertToXML(Object object) throws BisException;

	ReqVoucherConfirmation convertRespVouResponseToObject(String hbtResXML) throws BisException;

}
