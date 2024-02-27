package com.gov.nha.bis.erupi.voucher.service.impl;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.bouncycastle.util.encoders.Base64;

public class Encryption {

	
	private   String  keys;
	
	public Encryption(String keys) {
		super();
		this.keys = keys;
	}



	// public static void main(String[] args) {
	public static void mimi() {
	 
	  Encryption enc= new
	  //Encryption("NnY0UERxNVhkZDJwRFZCVFhPbG0xY3Y0ME1qMEpNdjJYQXlXSGY0eHpndz0=");
	  Encryption("5+s6cdNYmPw2oBOyvMdnK5Be2v8emy64gmKaJdfPHmA=");
//	  Instant now = Instant.now(); //current date
//	  Instant after= now.plus(Duration.ofDays(10));
//	  Date dateAfter = Date.from(after);
//	  System.out.println(dateAfter);
//	  
//	  NPCI SBI
//	  System.out.println("SBI");
//	  System.out.println(enc.encryptData("<voucher xmlns=\"https://erupi.nha.gov.in/voucher/request/schema/2.0\"\r\n"
//	  		+ "txn_type=\"CREATE\" mandate_name=\"scheme name\" validity_start=\"17052022\" validity_end=\"12082022\" amount=\"10000.00\" payer_addr=\"sbi\" payer_bank_code=\"9399\"\r\n"
//	  		+ "mid=\"SBI0000000031594\" sid=\"\" tid=\"\" payer_name=\"TMS\" ifsc=\"SBIN0000437\" acnum=\"30001190542\" actype=\"CURRENT\" payee_mobile=\"9167269707\" payee_name=\"tmsusername\"\r\n"
//	  		+ "payee_code=\"8099\" payee_brand=\"blood test\" txn_purpose=\"A1\"/>"));
//////	  
//	  System.out.println(enc.encryptData("<voucher xmlns=\"https://erupi.nha.gov.in/voucher/request/schema/2.0\"\r\n"
//		  		+ "txn_type=\"REVOKE\" mandate_name=\"scheme name\" validity_start=\"17052022\" validity_end=\"12082022\" amount=\"10000.00\" payer_addr=\"sbi\" payer_bank_code=\"9399\"\r\n"
//		  		+ "mid=\"SBI0000000031594\" sid=\"\" tid=\"\" payer_name=\"TMS\" ifsc=\"SBIN0000437\" acnum=\"30001190542\" actype=\"CURRENT\" payee_mobile=\"9167269707\" payee_name=\"tmsusername\"\r\n"
//		  		+ "payee_code=\"8099\" payee_brand=\"blood test\" txn_purpose=\"A1\" org_txn_id=\"NHA01ecd622ba081970bf873bdc6b79ba\"/>"));
////	
//	  //BOB 7395
//	  System.out.println("BOB");
//	  System.out.println(enc.encryptData("<voucher xmlns=\"https://erupi.nha.gov.in/voucher/request/schema/2.0\"\r\n"
//		  		+ "txn_type=\"CREATE\" mandate_name=\"scheme name\" validity_start=\"29092022\" validity_end=\"12122022\" amount=\"3000.00\" payer_addr=\"bob\" payer_bank_code=\"8493\"\r\n"
//		  		+ "mid=\"BOB0000000033119\" sid=\"\" tid=\"\" payer_name=\"TMS\" ifsc=\"BARB0BANEAS\" acnum=\"29040100005592\" actype=\"CURRENT\" payee_mobile=\"9167269707\" payee_name=\"tmsusername\"\r\n"
//		  		+ "payee_code=\"8099\" payee_brand=\"blood test\" txn_purpose=\"A1\" org_txn_id=\"\"/>"));
//	  
//	  
//	  System.out.println(enc.encryptData("<voucher xmlns=\"https://erupi.nha.gov.in/voucher/request/schema/2.0\"\r\n"
//		  		+ "txn_type=\"REVOKE\" mandate_name=\"scheme name\" validity_start=\"20042022\" validity_end=\"23042022\" amount=\"3000.00\" payer_addr=\"bob\" payer_bank_code=\"8493\"\r\n"
//		  		+ "mid=\"BOB0000000033119\" sid=\"\" tid=\"\" payer_name=\"TMS\" ifsc=\"BARB0BANEAS\" acnum=\"29040100005592\" actype=\"CURRENT\" payee_mobile=\"9167269707\" payee_name=\"tmsusername\"\r\n"
//		  		+ "payee_code=\"8099\" payee_brand=\"blood test\" txn_purpose=\"A1\" org_txn_id=\"NHA01ecc0e1c8c21638beac945aa72e7eee\"/>"));
	  
//	  
//	  
//	  System.out.println("ICICI");
	  System.out.println(enc.encryptData("<voucher xmlns=\"https://erupi.nha.gov.in/voucher/request/schema/2.0\"\r\n"
		  		+ "txn_type=\"CREATE\" mandate_name=\"scheme name\" validity_start=\"28022023\" validity_end=\"10032023\" amount=\"110000.00\" payer_addr=\"icici\" payer_bank_code=\"8062\"\r\n"
		  		+ "mid=\"408263\" sid=\"\" tid=\"\" payer_name=\"TMS\" ifsc=\"ICIC0DC0002\" acnum=\"000405011612\" actype=\"CURRENT\" payee_mobile=\"8910031746\" payee_name=\"tmsusername\"\r\n"
		  		+ "payee_code=\"8099\" payee_brand=\"blood test\" txn_purpose=\"1A\" state=\"07\" voucher_redemption_type=\"ASPRESENTED\" org_txn_id=\"\"/>"));
////	  //8493
//	  System.out.println(enc.encryptData("<voucher xmlns=\"https://erupi.nha.gov.in/voucher/request/schema/2.0\"\r\n"
//		  		+ "txn_type=\"REVOKE\" mandate_name=\"scheme name\" validity_start=\"29122022\" validity_end=\"10032023\" amount=\"3000.00\" payer_addr=\"icici\" payer_bank_code=\"8062\"\r\n"
//		  		+ "mid=\"408263\" sid=\"\" tid=\"\" payer_name=\"TMS\" ifsc=\"ICIC0DC0002\" acnum=\"000405011612\" actype=\"CURRENT\" payee_mobile=\"8910031746\" payee_name=\"tmsusername\"\r\n"
//		  		+ "payee_code=\"8099\" payee_brand=\"blood test\" txn_purpose=\"A1\" org_txn_id=\"NHA01ed879493a010209c660a74f35e567f\" state=\"07\" voucher_redemption_type=\"ASPRESENTED\" />"));
	  
	  
//	  System.out.println("HDFC");
//	  System.out.println(enc.encryptData("<voucher xmlns=\"https://erupi.nha.gov.in/voucher/request/schema/2.0\"\r\n"
//		  		+ "txn_type=\"CREATE\" mandate_name=\"scheme name\" validity_start=\"07092022\" validity_end=\"12082022\" amount=\"3000.00\" payer_addr=\"icici\" payer_bank_code=\"9399\"\r\n"
//		  		+ "mid=\"HDFC000014285047\" sid=\"\" tid=\"\" payer_name=\"TMS\" ifsc=\"HDFB0000240\" acnum=\"00030310014601\" actype=\"CURRENT\" payee_mobile=\"8910031746\" payee_name=\"tmsusername\"\r\n"
//		  		+ "payee_code=\"8099\" payee_brand=\"blood test\" txn_purpose=\"A1\" org_txn_id=\"\"/>"));
//////	  //8493
//	  System.out.println(enc.encryptData("<voucher xmlns=\"https://erupi.nha.gov.in/voucher/request/schema/2.0\"\r\n"
//		  		+ "txn_type=\"REVOKE\" mandate_name=\"scheme name\" validity_start=\"07092022\" validity_end=\"12082022\" amount=\"3000.00\" payer_addr=\"icici\" payer_bank_code=\"9399\"\r\n"
//		  		+ "mid=\"HDFC000014285047\" sid=\"\" tid=\"\" payer_name=\"TMS\" ifsc=\"HDFB0000240\" acnum=\"00030310014601\" actype=\"CURRENT\" payee_mobile=\"8910031746\" payee_name=\"tmsusername\"\r\n"
//		  		+ "payee_code=\"8099\" payee_brand=\"blood test\" txn_purpose=\"A1\" org_txn_id=\"NHA01ece8248c2f100sdsd896e1eb1c0b38bfd4\"/>"));

//////////	  
//	  System.out.println(enc.decrypt("TvfrtP8tAdlGjSaQEOR/4gxRPnMpqKZLntPrWRGNAwqEsYST09iCP7pbN4Uk0IxQF2hytqzYOXT6EWzIjT9nke28cgGmmEIimYA3prgNfaCUZXuUgnhKYSrRjm31DB4w8TONsXo26bPYFK+baXzwTXxXC9edDQpz1oW0M8jBFCmyt22f6hS9IVWQbStSoDrk5j8jM2vNUd4/WBdnW+5bz7gFxbJ6j1drMa0HSF0ZCzBtgQ2beTy+grsj7tAjHPVECubO1O8AFBXMHOCxuVV0ZTlu4YX1wxP2rUkNdnCH+r468YOCag0D1LUPqhSK6m3GtKXNZBXExEIhMXCxvZeWYmsTLyrWIysGBaXJUkDfrKTKfo7W97yeYjy5RU09ytfsh1icgLeWHZOd4ECbUJcaNK3aW8SGYc8U+pr8JsJDflRKChVZoJYZK1kodJYwM2xGYfUo/DpaWUPR4Y4qH8qWdrSdvdnOEaYAAysLd8MQzhMR8H4vY7awtqudHVaySKWpBvWLDezvRjlJqQCilW25Lq33dvHOuhGRwrgJUBHzSVPEK6XaYS1XpihVxMk5fZNKekWyd8mAhgCRJ11l22mdhWP4VWsmvbmLfLFaQ8Afn8DdzKH3ZWD+fRkrPs8nstLfyiv7UXgT58HSaUIGehCwvZew71u4PkfqlQYAIMNMpR2ywT97UVMWA/pVNpcXOC33"));
////	  System.out.println(enc.decrypt("zmv3ZibTPi9DJtWBxCiA7SYI4kSAMhKtlkHE5+lRjcA+lg05Z2Ehvgd+VyySmZwmFbGBqRw3Nvy3CQuPrNakXZo6LRxF9SJgf9qMJCvXfZecY9uSEIbz/g5g8cdspRUqAP34bU7/vd8VFlTk/8uGfKQ+2Tn3UvL7zfzF9BSlebw8fqQREaKmD5UkBiCTP7NzkyZYMnigAsOdrns2ljNQhIG8TLHUEYLYv2UHJySMXcqcCw2+ONDzVZBmVc5wsl1OWrO+4myqJvAC4v4mkmDtvhekwcTjk8YZ0WSWUu/4inAxfe/5YFzQISMlyyLuheVuPw0YSnawf+LqWPQlPs9sXR3KeXuTgwMh+erBQCCIhUmoPJGlgrjDe5BsgQXEz2vtZGilo5h7F7rEYUP3xg10+p3XPPSAjQ146EGZ/YnoPZ102XlBn0l8GNG5Rm+yhmzu+VBdYykpU3UNcPxGPO3JOcijswyKchwXv/ut3eMvd2xkA8UsqktPxVee203KUeqLgT2TMNOoMyzOwGrSRm77AvGrvFuC4+heE0VjtYVgqQ55IXUa66bR1rsKEupx8w7w9hh0Kn5Ezwe4C/U5cDh1uhsvOKxVWTIPWbcCIIvmnvg="));
////	  System.out.println(enc.decrypt("zmv3ZibTPi9DJtWBxCiA7SYI4kSAMhKtlkHE5+lRjcA+lg05Z2Ehvgd+VyySmZwmFbGBqRw3Nvy3CQuPrNakXZo6LRxF9SJgf9qMJCvXfZecY9uSEIbz/g5g8cdspRUqAP34bU7/vd8VFlTk/8uGfKQ+2Tn3UvL7zfzF9BSlebw8fqQREaKmD5UkBiCTP7NzkyZYMnigAsOdrns2ljNQhIG8TLHUEYLYv2UHJySMXcqcCw2+ONDzVZBmVc5wsl1OWrO+4myqJvAC4v4mkmDtvhekwcTjk8YZ0WSWUu/4inAxfe/5YFzQISMlyyLuheVuPw0YSnawf+LqWPQlPs9sXR3KeXuTgwMh+erBQCCIhUmoPJGlgrjDe5BsgQXEz2vtZGilo5h7F7rEYUP3xg10+p3XPPSAjQ146EGZ/YnoPZ102XlBn0l8GNG5Rm+yhmzu+VBdYykpU3UNcPxGPO3JOcijswyKchwXv/ut3eMvd2xkA8UsqktPxVee203KUeqL3WYYXfBgFWvZjzFomvZ9ywz0c+oAil8Zhs9egfSldWdzYEDdNvKH/DqI/mbr40Rwbhh0+RHyVEyPv9S5YMTw6ESmFrVL6LyWejvtLeVbl5s="));
////	  System.out.println(enc.decrypt("zmv3ZibTPi9DJtWBxCiA7SYI4kSAMhKtlkHE5+lRjcA+lg05Z2Ehvgd+VyySmZwmFbGBqRw3Nvy3CQuPrNakXZo6LRxF9SJgf9qMJCvXfZecY9uSEIbz/g5g8cdspRUqAP34bU7/vd8VFlTk/8uGfKQ+2Tn3UvL7zfzF9BSlebw8fqQREaKmD5UkBiCTP7NzkyZYMnigAsOdrns2ljNQhIG8TLHUEYLYv2UHJySMXcqcCw2+ONDzVZBmVc5wsl1OWrO+4myqJvAC4v4mkmDtvhekwcTjk8YZ0WSWUu/4inAxfe/5YFzQISMlyyLuheVuPw0YSnawf+LqWPQlPs9sXR3KeXuTgwMh+erBQCCIhUmoPJGlgrjDe5BsgQXEz2vtZGilo5h7F7rEYUP3xg10+p3XPPSAjQ146EGZ/YnoPZ102XlBn0l8GNG5Rm+yhmzu+VBdYykpU3UNcPxGPO3JOcijswyKchwXv/ut3eMvd2xkA8UsqktPxVee203KUeqLbCThYpXPtKyb43OrqcZy6j5Z/hCjzFwk45pL3clQhLPbs6kTPGvDy/1PRbfjq4veTE1HLpPhcBMbgSCmNAUePBITDA34ffXluax1CWfXWJE="));
	  }
	 
	public String decryptData(String toBeDecrypted){ 	
		String ss = decrypt(toBeDecrypted);
		return ss;
	}
	
	public String getKeys() {
		return keys;
	}

	public void setKeys(String keys) {
		this.keys = keys;
	}

	public String encryptData(String toecrypted){ 	
		String ss = encrypt(toecrypted);
		return ss;
	}
	
	public static String convertToMD5(String text) throws NoSuchAlgorithmException, UnsupportedEncodingException   {

		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(text.getBytes("iso-8859-1"), 0, text.length());
		byte[] md5hash = md.digest();
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < md5hash.length; i++) {
			int halfbyte = (md5hash[i] >>> 4) & 0x0F;
			int two_halfs = 0;
			do {
				if ((0 <= halfbyte) && (halfbyte <= 9))	buf.append((char) ('0' + halfbyte));
				else	buf.append((char) ('a' + (halfbyte - 10)));
				halfbyte = md5hash[i] & 0x0F;
			} while(two_halfs++ < 1);
		}
		return buf.toString();  
}

	public  SecretKeySpec setKey(String myKey) throws UnsupportedEncodingException, NoSuchAlgorithmException  {
		byte[] key = myKey.getBytes("UTF-8");
		key = Arrays.copyOf(key, 16);
		SecretKeySpec secretKey = new SecretKeySpec(key, "AES");
		return secretKey;
	}
	
	public  String encrypt(String Text, String salt,String pwd) throws NoSuchAlgorithmException, NoSuchPaddingException, UnsupportedEncodingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
		Cipher ciper = Cipher.getInstance("AES/CBC/PKCS5Padding");
		SecretKeySpec skKey=setKey(salt);
		IvParameterSpec iv = new IvParameterSpec(pwd.getBytes(), 0, ciper.getBlockSize());
		ciper.init(Cipher.ENCRYPT_MODE, skKey, iv);
		byte[] encValue = ciper.doFinal(Text.getBytes());
		byte[] encodedBytes = Base64.encode(encValue);
		
		return new String(encodedBytes);
	}

	public  String decrypt(String strToDecrypt, String salt,String pwd) throws NoSuchAlgorithmException, NoSuchPaddingException, UnsupportedEncodingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
		Cipher ciper = Cipher.getInstance("AES/CBC/PKCS5Padding");
		SecretKeySpec skKey=setKey(salt);
		IvParameterSpec iv = new IvParameterSpec(pwd.getBytes(), 0, ciper.getBlockSize());
		ciper.init(Cipher.DECRYPT_MODE, skKey, iv);
		byte[] encValue = ciper.doFinal((Base64.decode(strToDecrypt)));
		
		return new String(encValue);
	}
	
	public  String decrypt(String cipherText) {
		String TextEnc ="";
		try
		{
			String saltedPassword = convertToMD5(keys); 
			TextEnc = decrypt(cipherText, saltedPassword, keys);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return TextEnc;
	}


	public  String encrypt(String cipherText) {
		String TextEnc ="";
		try
		{
			String saltedPassword = convertToMD5(keys); 
			TextEnc = encrypt(cipherText, saltedPassword, keys);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return TextEnc;
	}

}
