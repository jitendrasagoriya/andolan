package com.indian.andolan.tokengenerator;

import java.security.SecureRandom;
/**
 * @author jitendra sagoriya
 *
 */
public class SecureTokenGenerator {
	
	public static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

	// 2048 bit keys should be secure until 2030 - https://web.archive.org/web/20170417095741/https://www.emc.com/emc-plus/rsa-labs/historical/twirl-and-rsa-key-size.htm
	public static final int SECURE_TOKEN_LENGTH = 256/14;

	private static final SecureRandom random = new SecureRandom();

	private static final char[] symbols = CHARACTERS.toCharArray();

	private static final char[] buf = new char[SECURE_TOKEN_LENGTH];
	
	/**
	 * Generate the next secure random token in the series.
	 */
	public static String nextToken() {
	    for (int idx = 0; idx < buf.length; ++idx)
	        buf[idx] = symbols[random.nextInt(symbols.length)];
	    return new String(buf);
	}
	
	public static int getHash(String userName) {
		return userName.hashCode();
	}
	
	public static String getToken() {
		String token = nextToken() +""+System.currentTimeMillis();
		return token;
	}
	
	public static void main(String[] args) {
		String token = getToken();
		System.out.println(token  );
		System.out.println(token.length());
	}

}