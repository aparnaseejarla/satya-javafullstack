package com.test.multitheading;

public class TestThread {

	public static void main(String[] args)
	{
		int n = 8; 
		for (int i = 1; i < n; i++) {
			UsingThreadClass t = new UsingThreadClass();
			UsingThreadClass t1 = new UsingThreadClass();

             //t.start();
             //System.out.println("Before t1 starts************");
             //t1.start();
             
			Thread runnnableThread = new Thread(new UsingRunnableInterface());
			runnnableThread.start();
			System.out.println(runnnableThread.getPriority());
		}


	}
}
