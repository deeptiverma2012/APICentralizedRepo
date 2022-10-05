package org.testing.utilities;

import java.util.Random;

public class generateRandomNames {
	
	public static String generateNames(int len)
	{
		String chars ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijk";
		Random r = new Random();
		StringBuilder sb = new StringBuilder(len);
		for(int i=0;i<len;i++)
		{
			sb.append(chars.charAt(r.nextInt(chars.length())));
		
					
		}
		System.out.println(sb.toString());
		return sb.toString();
	}

}
