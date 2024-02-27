/**
 * @author Vinay Kushwaha
 * @Email  vinaykushwaha85@gmail.com

 */

package com.gov.nha.bis.server.util;

import com.gov.nha.bis.security.exception.NhaSecurityException;


public class ConfigurationException extends NhaSecurityException {

	private static final long serialVersionUID = 3701988945281084465L;

	public ConfigurationException(String message) {
		super(message);
	}

	public ConfigurationException(String message, int errorCode) {
		super(message, errorCode);

	}

	public ConfigurationException(String message, Throwable cause) {
		super(message, cause);

	}

	public ConfigurationException(Throwable cause) {
		super(cause);
	}

}
