package com.test.multitheading;

import java.util.ArrayList;
import java.util.List;

public class MyThreadJoin extends Thread {


	public void run(){  
		for(int i=1;i<=2;i++){  
			try{  
				Thread.sleep(500);  
			}catch(Exception e){System.out.println(e);}  
			System.out.println(i);  
		}  
	}  
	public static void main(String args[]){  
		MyThreadJoin t1=new MyThreadJoin();  
		MyThreadJoin t2=new MyThreadJoin();  
		MyThreadJoin t3=new MyThreadJoin();  

		t1.start();  
		try{  
			t1.join();  
		}catch(Exception e){
			System.out.println(e);}  
		t2.start(); 
		t3.start();
		
	}  

}

