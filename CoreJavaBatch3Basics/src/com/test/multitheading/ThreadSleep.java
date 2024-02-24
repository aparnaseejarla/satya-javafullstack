package com.test.multitheading;

public class ThreadSleep {

	public static void main(String[] args) {

		try {
			for (int i = 0; i < 5; i++) {
				Thread.sleep(1000000000);// sleep
				System.out.println(i);
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
