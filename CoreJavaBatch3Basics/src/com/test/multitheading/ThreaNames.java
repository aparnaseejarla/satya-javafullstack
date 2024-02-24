package com.test.multitheading;

public class ThreaNames extends Thread {


	public void run(){  
		System.out.println("running...");  
		  System.out.println(Thread.currentThread().getName());  
	}  
	public static void main(String args[]){  
		
		ThreaNames t1=new ThreaNames();  
		ThreaNames t2=new ThreaNames();  
		
		System.out.println("Name of t1:"+t1.getName());  
		System.out.println("Name of t2:"+t2.getName());  

		t1.start();  
		t2.start();  

		t1.setName("Demo Thread");  
		System.out.println("After changing name of t1:"+t1.getName());  
		
		t2.setName("demo");
		System.out.println("thread2 name : "+t2.getName());
	}  
}  

