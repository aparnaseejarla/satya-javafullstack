package com.test.multitheading;

public class UsingRunnableInterface implements Runnable {

	public void run()
	{
		try {
			System.out.println(
					"Thread  is running");
		}catch (Exception e) {
			System.out.println("Exception is caught");
		}
	}
	
public static void main(String[] args) {
		
	UsingRunnableInterface t1 = new UsingRunnableInterface();
		t1.run();
		t1.run();
		
		
}
}
