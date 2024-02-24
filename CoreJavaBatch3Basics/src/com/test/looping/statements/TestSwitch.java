package com.test.looping.statements;

public class TestSwitch {

	static String grade = "A"; 
	
	public static void main(String[] args) {

		//char grade = args[0].charAt(0);
		switch(grade)
		{ 
		case "A" : System.out.println("Excellent!"); break; 
		case "F" : System.out.println("Better try again"); break;
		default : System.out.println("Invalid grade"); 
		} 
		System.out.println("Your grade is " + grade);
	}

}
