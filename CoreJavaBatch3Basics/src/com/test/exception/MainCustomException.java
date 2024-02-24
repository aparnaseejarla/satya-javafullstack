package com.test.exception;


class MainCustomException {

	static void validate (int age) throws InvalidAgeException{    
		if(age < 18){  
			// throw an object of user defined exception  
			throw new InvalidAgeException("age is not valid to vote");    
		}  
		else {   
			System.out.println("welcome to vote"); 
		}   
	}   

	// main method  
	public static void main(String args[])  
	{  
		try  {  
			validate(13);  
		}  
		catch (InvalidAgeException ex)  { 
			System.out.println("Caught the exception");  
			// printing the message from InvalidAgeException object  
			System.out.println("Exception occured: " + ex);  
		}  
		System.out.println("rest of the code...");    
	}  
} 