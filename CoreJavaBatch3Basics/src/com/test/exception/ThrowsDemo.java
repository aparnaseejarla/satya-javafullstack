package com.test.exception;


public class ThrowsDemo {

	static void func(int a,int b) throws ArithmeticException, ArrayIndexOutOfBoundsException{
		System.out.println(10/a); 
		int[] arr={1,2,3};
		System.out.println(arr[b]);
	}
	public static void main (String[] args) {
		for(int i=0;i<3;i++){//0,1,2
			try{
				func(10,20);
			}catch(ArithmeticException e){
				System.out.println("can't divide by zero");
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Out of bounds!");
				e.printStackTrace();
				System.out.println(e.getMessage());

			}
		}
	}
}