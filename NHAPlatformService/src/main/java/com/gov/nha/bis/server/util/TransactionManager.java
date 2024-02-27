/**
 * @author Vinay Kushwaha
 * @Email  vinaykushwaha85@gmail.com

 */
package com.gov.nha.bis.server.util;

import java.util.UUID;

public class TransactionManager {
	
	public static String getTransactionId() {
		
		return "NHA:"+UUID.randomUUID().toString();
	}
	
public static String getKycTransactionId() {
		
		return "UKC:"+UUID.randomUUID().toString();
	}

}
