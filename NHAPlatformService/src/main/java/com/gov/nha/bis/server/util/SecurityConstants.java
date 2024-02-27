/**
 * @author Vinay Kushwaha
 * @Email  vinaykushwaha85@gmail.com

 */
package com.gov.nha.bis.server.util;

public interface SecurityConstants {

	/**
	 * Base Algorithm used for security of secret key
	 */
	String BASE_ALGORITHM = "RSA";

	/**
	 * Base Algorithm used for security of data
	 */
	String ENCRYPT_ALGORITHM = "AES/CFB/NoPadding";
	
	/**
	 * Secret Key Algorithm
	 */
	String SECRET_KEY_ALGORITHM = "AES";
	
	/**
	 * size of X509 RSA public key in bytes
	 */
	int PUBLIC_KEY_SIZE = 294;

	/**
	 * size of randomly generated enrollment id at client side
	 */
	int EID_SIZE = 32;
	
	/**
	 * size of encrypted AES secret key
	 */
	int SECRET_KEY_SIZE = 256;

	/**
	 * Algorithm used for decryption of symmetric key
	 */
	String TRANSFORMATION = "RSA/ECB/OAEPWITHSHA-256ANDMGF1PADDING";
	
	/**
	 * RSA Implementation provider
	 */
	String SECURITY_PROVIDER = "BC";
	
	/**
	 * Message Digest Algorithm
	 */
	String DIGEST_ALGORITHM = "SHA-256";

	/**
	 * Masking Generator function
	 */
	String MASKING_FUNCTION = "MGF1";
	
	/**
	 * Size of the Initialization Vector in bytes
	 */
	int VECTOR_SIZE = 16;
	
	/**
	 * Base Algorithm used for security of data
	 */
	String DECRYPT_ALGORITHM = "AES/CFB/NoPadding";
	
	/**
	 * Default Size of the HMAC/Hash Value in bytes
	 */
	int HMAC_SIZE = 32;
	
	/**
	 * Block size for AES encryption.
	 */
	int BLOCK_SIZE = 128;
	
	byte[] HEADER_DATA = "VERSION_1.0".getBytes();
	byte[] HEADER1_DATA = "VERSION_1.1".getBytes();
	
	/**
	 * LUNA JCA provider
	 */
	String LUNA_JCA_PROVIDER = "LunaJCAProvider";
	
	/**
	 * LUNA JCE provider
	 */
	String LUNA_JCE_PROVIDER = "LunaJCEProvider";
	
	
	/**
	 * LUNA 5 Provider
	 */
	String LUNA5_PROVIDER = "LunaProvider";
	
	/**
	 * LUNA Keystore type.
	 */
	String LUNA_KEY_STORE_TYPE = "Luna";
	
	/**
	 * LUNA Keystore type.
	 */
	String RSA_NOPADDING_TRANSFORMATION = "RSA/ECB/NoPadding";
	
	/**
	 * AES-CBC-PKCS5PADDING algorithm transformation.
	 */
	String AES_CBC_PKCS5PADDING = "AES/CBC/PKCS5Padding";
	
	String RANDOM_ALGORITH_NAME = "SHA1PRNG";
	
	/**
	 * size of X509 RSA public key in bytes
	 */
	int LEGACY_PUBLIC_KEY_SIZE = 162;

	/**
	 * size of encrypted AES secret key
	 */
	int LEGACY_SECRET_KEY_SIZE = 128;
	
	/**
	 * MD5 Hashing algorithm.
	 */
	String MD5_DIGEST_ALGORITHM = "MD5";
	
	/**
	 * Size of the AES secret key in bits
	 */
	int NEW_SECRET_KEY_SIZE = 256;
	
	/**
	 * Size of the Block Cipher in bytes (128 bits)
	 */
	int BLOCK_CIPHER_SIZE = 16;
	
	/**
	 * RSA Implementation provider
	 */
	String BC_SECURITY_PROVIDER = "BC";
	
	int INITIAL_CONNECTION_POOL_SIZE =5;
	
	int MAX_CONNECTION_POOL_SIZE=20;
	
}
