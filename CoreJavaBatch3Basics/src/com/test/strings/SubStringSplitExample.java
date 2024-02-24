package com.test.strings;

import java.util.Arrays;

public class SubStringSplitExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "java is fun";
		System.out.println(str1.length());
		// extract substring from index 0 to 3
		//System.out.println(str1.substring(0, 7));



		String text = "Java,is,a,fun programming,language";
		// split string from space
		String[] result = text.split(",");	 
		String s1 = null;
		StringBuffer buffer = new StringBuffer();
		for (String str : result) {
			s1 = str.concat("* ");
			buffer.append(s1);
			//System.out.print(s1);
		}	
		String s4 = buffer.toString();
		System.out.println(s4.substring(0,13));

		System.out.println();
		String chars = "a::b::c::d::e";
		String[] result1 = chars.split("::");
		//	System.out.println("result = " + Arrays.toString(result1));



	}

}
