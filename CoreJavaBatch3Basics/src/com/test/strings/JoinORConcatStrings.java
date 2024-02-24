package com.test.strings;

public class JoinORConcatStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    // create first string
	    String first ="Hello";
	    System.out.println("First String: " + first);

	    
	    // create second
	    String second = "Programming";
	    System.out.println("Second String: " + second);
	    System.out.println("Joining the strings using + operator :: "+first+" "+second);

	    // join two strings
	    //String s2 = first +" "+second;
	    //System.out.println(s2);
	    String joinedString = first.concat(second);
	    
	    System.out.println("Joined String: " + joinedString);


	}

}
