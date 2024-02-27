/**
 * @author Vinay Kushwaha
 * @Email  vinaykushwaha85@gmail.com

 */
package com.gov.nha.bis.security.exception;

public class NhaAuthenticationClientException extends Exception {

	private static final long serialVersionUID = 1L;

	public NhaAuthenticationClientException() {
		super();
	}
	
	public NhaAuthenticationClientException(String message, Throwable t) {
		super(message, t);
	}
	
	public NhaAuthenticationClientException(String message) {
		super(message);
	}

}
