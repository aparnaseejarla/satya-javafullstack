package com.java8.features;

public class MethodReference {

	
	
	//Method reference is a Java 8 construct used to reference a method without having to invoke it. It is a compact method of Lambda expression.


	 public static void saySomething(){  
	        System.out.println("Hello, this is static method.");  
	    }  
	    public static void main(String[] args) {  
	        // Referring static method  
	    	MethodReference sayable = MethodReference::saySomething;  
	    }  
}


