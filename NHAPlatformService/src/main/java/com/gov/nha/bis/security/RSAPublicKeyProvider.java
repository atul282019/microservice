/**
 * @author Vinay Kushwaha
 * @Email  vinaykushwaha85@gmail.com

 */

package com.gov.nha.bis.security;

import java.util.List;

public interface RSAPublicKeyProvider {
	
	public List<String> getPublicKey(String orgKey, String keyUsageType);

}
