package com.test.exception;

public class Exception {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Nullpointer
		String str = null;
		//System.out.println(str.length());

		//Number format exception
		String s = "abc";
		int c = Integer.parseInt(s);
		System.out.println(c);
		
		//ArrayIndexOutOfBoundsException
		int arr[] = {10,20,40};
		System.out.println(arr[0]);
		System.out.println(arr[5]);
		
		

	}

}
