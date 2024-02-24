package com.java8.features;

public interface DefaultMethodsInInterfaces {

	// abstract method 
	public void square(int a); 

	// default method 
	default void show() 
	{ 
		System.out.println("Default Method Executed"); 
	} 

}
