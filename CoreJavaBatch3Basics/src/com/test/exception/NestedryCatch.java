package com.test.exception;

public class NestedryCatch {


	public static void main(String args[]){
		/// step1 -db conns
		//risky code
		
		//main try-block
		try{
			//try-block2
			try{     
				//try-block3
				try{
					int arr[]= {1,2,3,4};
					System.out.println(arr[10]);
				}catch(ArithmeticException e){
					System.out.print("Arithmetic Exception");
					System.out.println(" handled in try-block3");
				}
			}
			catch(ArithmeticException e){
				System.out.print("Arithmetic Exception");
				System.out.println(" handled in try-block2");
			}
		}
		catch(ArithmeticException e3){
			System.out.print("Arithmetic Exception");
			System.out.println(" handled in main try-block");
		}
		catch(ArrayIndexOutOfBoundsException e4){
			System.out.print("ArrayIndexOutOfBoundsException");
			System.out.println(" handled in main try-block");
		}

	}
}
