package com.test.looping.statements;

public class TestBreak {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] numbers = {10, 20, 30, 40, 50};
		 for(int x : numbers )
		 {
			 if( x == 30 | x == 40)
			 {
				 continue;
			 } 
			System.out.print( x );
			System.out.print("\n"); 
			} 
		 } 
	}
