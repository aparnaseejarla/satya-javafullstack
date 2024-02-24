package com.test.exception;

public class MultipleCatchBlocks {

	public static void main(String args[]){
	     
		try{
	         int arr[]=new int[7];
	        arr[4]=30/0;
	         arr[10] =10;
	         System.out.println("Last Statement of try block");
	      }
	      catch(ArithmeticException e){
	         System.out.println("You should not divide a number by zero");
	      }
	      catch(ArrayIndexOutOfBoundsException e){
	         System.out.println("Accessing array elements outside of the limit");
	      }
	      System.out.println("Out of the try-catch block");
	   }
}
