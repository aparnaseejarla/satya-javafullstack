package com.test.multitheading;

public class ThreadPriority extends Thread {

	public void run(){  
		//System.out.println("Running thread name is:"+Thread.currentThread().getName());  
		System.out.println("Running thread priority is:"+Thread.currentThread().getPriority());  

	}  
	public static void main(String args[]){  
		
		ThreadPriority m1=new ThreadPriority();  
		ThreadPriority m2=new ThreadPriority(); 
		
		//Setting the Priority
		m1.setPriority(Thread.MIN_PRIORITY);  
		m2.setPriority(Thread.MAX_PRIORITY);  
		
		//Setting the name of the thread
		m1.setName("My Thread");
		//Starting threads
		m1.start(); 
		m2.start();  

	}  
}
