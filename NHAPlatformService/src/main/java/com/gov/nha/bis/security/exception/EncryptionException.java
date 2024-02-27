/**
 * @author Vinay Kushwaha
 * @Email  vinaykushwaha85@gmail.com

 */
package com.gov.nha.bis.security.exception;

public class EncryptionException extends NhaSecurityException {

	private static final long serialVersionUID = -4064529933657504359L;

	public EncryptionException() {
	}

	public EncryptionException(String message) {
		super(message);
	}

	public EncryptionException(Throwable cause) {
		super(cause);
	}

	public EncryptionException(String message, Throwable cause) {
		super(message, cause);
	}


	public Throwable getRootCause() {
		Throwable e = getCause();
		Throwable eParent;
		for (eParent = this; e != null && e != eParent; e = e.getCause())
			eParent = e;

		return eParent;
	}


}

