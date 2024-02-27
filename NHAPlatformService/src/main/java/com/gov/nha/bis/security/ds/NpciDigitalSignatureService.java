package com.gov.nha.bis.security.ds;


import org.w3c.dom.Document;

import com.gov.nha.bis.security.exception.BisException;

public interface NpciDigitalSignatureService {

	boolean verify(Document xmlDoc) throws BisException;
	
}
