package com.test.multitheading;

public class UsingThreadClass extends Thread{

	public void run()
	{
		try {
			System.out.println(
					"Thread " + " is running");
		}
		catch (Exception e) {
			System.out.println("Exception is caught");
		}
	}
	
	public static void main(String[] args) {
		
		UsingThreadClass t1 = new UsingThreadClass();
		t1.start();
		UsingThreadClass t2 = new UsingThreadClass();
		t2.start();
		
		
		
	}
}