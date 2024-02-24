package com.test.strings;

import java.util.StringTokenizer;

public class StringTokenizerDemoAndRepalce {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		StringTokenizer st = new StringTokenizer("my name is kiran"," ");
		
		while (st.hasMoreTokens()) {  
			System.out.println(st.nextToken());  
		}  


		String str1 = "welcome to demo";
		System.out.println(str1.replace('d', 'D'));
		
	    String str = "Welcome to java";
	    System.out.println(str.replaceAll("Welcome", "WECLCOME"));
	    
	    
	    String str2 = "Java123is456fun";

	    // regex for sequence of digits
	    String regex = "\\d+";
	    System.out.println(str2.replaceAll(regex, " "));



	}

}
