/**
 * @author Vinay Kushwaha
 * @Email  vinaykushwaha85@gmail.com

 */
package com.gov.nha.bis.server.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public final class CryptoUtility {

	private static final String RANDOM_ALGORITH_NAME = "SHA1PRNG";

	public static String byteArrayToHexString(byte[] bytes) {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < bytes.length; i++) {
			result.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16)
					.substring(1));
		}
		return result.toString();
	}

	public static byte[] hexStringToByteArray(String data) {
		int k = 0;
		byte[] results = new byte[data.length() / 2];
		for (int i = 0; i < data.length();) {
			results[k] = (byte) (Character.digit(data.charAt(i++), 16) << 4);
			results[k] += (byte) (Character.digit(data.charAt(i++), 16));
			k++;
		}
		return results;
	}

	public static byte[] mergeStream(byte[] byte2, byte[] byte1) {
		byte[] message = new byte[byte1.length + byte2.length];
		System.arraycopy(byte1, 0, message, 0, byte1.length);
		System.arraycopy(byte2, 0, message, byte1.length, byte2.length);
		return message;
	}

	public static byte[][] split(byte[] src, int n) {
		byte[] l, r;
		if (src == null || src.length <= n) {
			l = src;
			r = new byte[0];
		} else {
			l = new byte[n];
			r = new byte[src.length - n];
			System.arraycopy(src, 0, l, 0, n);
			System.arraycopy(src, n, r, 0, r.length);
		}
		return new byte[][] { l, r };
	}

	public static byte[] getBytesFromFile(String fileName) {

		InputStream is = null;
		byte[] bytes = null;
		try {
			File file = new File(fileName);
			is = new FileInputStream(file);

			long length = file.length();

			if (length > Integer.MAX_VALUE) {
				// File is too large
			}

			bytes = new byte[(int) length];

			// Read in the bytes
			int offset = 0;
			int numRead = 0;
			while (offset < bytes.length
					&& (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0) {
				offset += numRead;
			}

			// Ensure all the bytes have been read in
			if (offset < bytes.length) {
				throw new IOException("Could not completely read file "
						+ file.getName());
			}
		} catch (IOException e) {
			throw new RuntimeException("Failed to read the file");
		}
		// Close the input stream and return bytes
		finally {
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					throw new RuntimeException("Failed to close the file");
				}
			}
			is = null;
		}
		return bytes;
	}

	public static SecureRandom generateRandom() {
		SecureRandom sr = null;
		try {
			// Create a secure random number generator instance
			sr = SecureRandom.getInstance(RANDOM_ALGORITH_NAME);
			// Get 1024 random bits
			byte[] bytes = new byte[1024 / 8];
			sr.nextBytes(bytes);
			int seedByteCount = 10;
			byte[] seed = sr.generateSeed(seedByteCount);
			sr = SecureRandom.getInstance(RANDOM_ALGORITH_NAME);
			// Setting the seed value
			sr.setSeed(seed);

		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException("Random Number Generation Error.");
		}
		return sr;
	}
	
	public static byte[] generateRandomNumber() {
		SecureRandom random = null; 
		byte[] bytes = null;
		try {
			// Get 1024 random bits
			bytes = new byte[1024 / 8];
			random = new SecureRandom();
			random.nextBytes(bytes);
		} catch (Exception e) {
			throw new RuntimeException("Random Number Generation Error.");
		}
		return bytes;
	}


	public static String generateLongRandom() {
		SecureRandom sr = null;
		try {
			// Create a secure random number generator instance
			sr = SecureRandom.getInstance(RANDOM_ALGORITH_NAME);
			// Get 1024 random bits
			byte[] bytes = new byte[1024 / 8];
			sr.nextBytes(bytes);
			int seedByteCount = 10;
			byte[] seed = sr.generateSeed(seedByteCount);
			sr = SecureRandom.getInstance(RANDOM_ALGORITH_NAME);
			// Setting the seed value
			sr.setSeed(seed);

		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException("Random Number Generation Error.");
		}
		return String.valueOf(Math.abs(sr.nextLong()));
	}
	
	public static void copyByteArray(byte[] src, int offset, int length, byte[] dest) {
		System.arraycopy(src, offset, dest, 0,length);
	}
	
	public static byte[] intToByteArray(int value) {
        byte[] b = new byte[4];
        for (int i = 0; i < 4; i++) {
            int offset = (b.length - 1 - i) * 8;
            b[i] = (byte) ((value >>> offset) & 0xFF);
        }
        return b;
    }
	
	public static int byteArrayToInt(byte [] b) {
        return (b[0] << 24)
                + ((b[1] & 0xFF) << 16)
                + ((b[2] & 0xFF) << 8)
                + (b[3] & 0xFF);
	}
	
	public static byte[] longToByteArray(long value) {
		byte[] b = new byte[8];
        for (int i = 0; i < 4; i++) {
            int offset = (b.length - 1 - i) * 8;
            b[i] = (byte) ((value >>> offset) & 0xFF);
        }
        return b;
	}

	public static long byteArrayToLong(byte[] array) {
		int offset = 0;
	    return
	      ((long)(array[offset]   & 0xff) << 56) |
	      ((long)(array[offset+1] & 0xff) << 48) |
	      ((long)(array[offset+2] & 0xff) << 40) |
	      ((long)(array[offset+3] & 0xff) << 32) |
	      ((long)(array[offset+4] & 0xff) << 24) |
	      ((long)(array[offset+5] & 0xff) << 16) |
	      ((long)(array[offset+6] & 0xff) << 8) |
	      ((long)(array[offset+7] & 0xff));
	}

}
