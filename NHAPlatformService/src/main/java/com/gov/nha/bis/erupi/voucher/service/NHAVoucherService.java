	package com.gov.nha.bis.erupi.voucher.service;

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
import com.gov.nha.bis.security.exception.BisException;

public interface NHAVoucherService {

	VoucherReq convertToVoucherReq(String reqxml) throws BisException;
	
	Voucher getVoucherDecryptData (byte [] voucherData,String dycryptionKey) throws BisException;

	String convertToXML(Object object) throws BisException;

	VoucherResAck authenticate(String xml, String urlTxn, String uuid,String token) throws BisException;

	VoucherConfirmationResp convertToVoucherConfirmationResp(String hbtResXML) throws BisException;

	VoucherConfirmationReqAck authenticateConfirmation(String xml, String urlTxn, String uuid,String token) throws BisException;

	String getVoucherEncyptData(String xml, String encryptionKey) throws BisException;

	VoucherReqAck convertToVoucherReqAck(String request) throws BisException;

	VoucherRes convertToVoucherResponse(String request) throws BisException;

	VoucherConfirmationReq convertToVoucherConfirmationReq(String hbtResXML) throws BisException;

	VoucherConfirmationRespAck convertToVoucherConfirmationRespAck(String hbtResXML) throws BisException;

	VoucherCurrentStatusReq convertToVoucherCurrentStatusReq(String req) throws BisException;
	

}
