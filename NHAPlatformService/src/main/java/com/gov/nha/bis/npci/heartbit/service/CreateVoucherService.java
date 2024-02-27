package com.gov.nha.bis.npci.heartbit.service;

import com.gov.nha.bis.security.exception.BisException;
import com.gov.nha.bis.upi.ack.Ack;
import com.gov.nha.bis.upi.ack.ReqVoucher;
import com.gov.nha.bis.upi.ack.RespVoucher;

public interface CreateVoucherService {

	public String reqHbtForSignature(ReqVoucher reqvou)  throws BisException;
	
	public Ack authenticate(String reqHbtForSignatureXml,String urlTxn,String uuid) throws BisException;
	
	public String convertToXML(Object object) throws BisException;

	RespVoucher convertToCreateResponseObject(String createVoucherResponse) throws BisException;

}
