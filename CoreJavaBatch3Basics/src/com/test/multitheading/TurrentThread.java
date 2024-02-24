package com.test.multitheading;

public class TurrentThread  extends Thread{

	public void run(){  
		System.out.println(Thread.currentThread().getName());  
	}  

	public static void main(String args[]){  
		TurrentThread t1=new TurrentThread();  
		TurrentThread t2=new TurrentThread();  

		t1.start();  
		t2.start();  
	}  

}
