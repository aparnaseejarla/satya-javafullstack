package com.test.exception;

public class TryDemo {


	public static void main(String[] args) {

		int a=10;
		int b = 0;
		
		try{
			int c = a/b;
			//System.out.println(c);
		}
		catch(ArithmeticException ae){
			System.out.println(ae.getMessage());
		}
		finally{
			//close db cons.file close..etc
			System.out.println("Hello I am try block...");
		}
	}
}

