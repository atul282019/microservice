/**
 * @author Vinay Kushwaha
 * @Email  vinaykushwaha85@gmail.com

 */
package com.gov.nha.bis.security.exception;

public class NhaSecurityException extends Exception {

	private static final long serialVersionUID = -4064529933657504359L;

	private int errorCode = -1;

	public NhaSecurityException() {
	}

	public NhaSecurityException(String message) {
		super(message);
	}

	public NhaSecurityException(String message, int errorCode) {
		super(message);
		this.errorCode = errorCode;
	}

	public NhaSecurityException(Throwable cause) {
		super(cause);
	}

	public NhaSecurityException(String message, Throwable cause) {
		super(message, cause);
	}

	public Throwable getRootCause() {
		Throwable e = getCause();
		Throwable eParent;
		for (eParent = this; e != null && e != eParent; e = e.getCause())
			eParent = e;

		return eParent;
	}

	public int getErrorCode() {
		return errorCode;
	}

}
