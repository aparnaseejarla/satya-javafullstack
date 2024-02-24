package com.java8.features;

public class DefaultMethodTestClass implements DefaultMethodsInInterfaces{

	// implementation of square abstract method 
    public void square(int a) 
    { 
        System.out.println(a*a); 
    } 
  
    public static void main(String args[]) 
    { 
    	DefaultMethodTestClass d = new DefaultMethodTestClass(); 
        d.square(4); 
  
        // default method executed 
        d.show(); 
    } 
}
