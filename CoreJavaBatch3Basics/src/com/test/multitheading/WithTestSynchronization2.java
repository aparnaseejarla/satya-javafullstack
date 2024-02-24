package com.test.multitheading;

public class WithTestSynchronization2 {

	public static void main(String args[]){  
		Table obj = new Table();//only one object  
		MyThread3 t1=new MyThread3(obj);  
		MyThread4 t2=new MyThread4(obj);  
		t1.start();  
		t2.start();  
	}  
}  

