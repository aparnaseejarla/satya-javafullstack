package com.test.looping.statements;

public class TestForEach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[] = {"test1","test2","test3"};
		
		/*
		 * for(String name : arr){ System.out.println(name);
		 * 
		 * }
		 */
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
	}

}
