package com.test.strings;

public class CompareStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // create 3 strings
	    String first = "java programming";
	    String second = "java programming";
	    String third = "python programming";
	    String four = "demo";

	    //Using equal method
	    // compare first and second strings
	    boolean result1 = first.equals(second);
	    System.out.println("Strings first and second are equal: " + result1);
	    // compare first and third strings
	    boolean result2 = first.equals(third);
	    System.out.println("Strings first and third are equal: " + result2);
	    
	    //Using == operatore
	    String s3=new String("java programming");  
	    System.out.println(first==second);
	    System.out.println(second == s3);


	    //using ComaparTo method
	    System.out.println(first.compareTo(second));
	    System.out.println(second.compareTo(s3));
	    System.out.println(third.compareTo(s3)); 

	    
	    
	    
		
	}

}
