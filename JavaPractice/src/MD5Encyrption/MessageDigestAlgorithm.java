package MD5Encyrption;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MessageDigestAlgorithm {
	
	public static String getMD5(String input){
		try{
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] messageDigest  = md.digest(input.getBytes());
			BigInteger number = new BigInteger(1,messageDigest);
			String hashtext = number.toString(16);
			while(hashtext.length()< 32){
				hashtext = "0" + hashtext;
			}
			return hashtext;
			
			
			
		}catch(NoSuchAlgorithmException e){
			throw new RuntimeException(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getMD5("kotreshtm"));

	}

}
