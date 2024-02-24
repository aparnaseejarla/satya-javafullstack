package com.test.multitheading;

public class TableWithSync {

	synchronized void printTable(int n){//synchronized method  
		for(int i=1;i<=5;i++){  
			System.out.println(n*i);  
			try{  
				Thread.sleep(400);  
			}catch(Exception e){
				System.out.println(e);}  
		}  

	}  
}  

class MyThread3 extends Thread{  
	Table t;  
	MyThread3(Table t){  
		this.t=t;  
	}  
	public void run(){  
		t.printTable(5);  
	}  

}  
class MyThread4 extends Thread{  
	Table t;  
	MyThread4(Table t){  
		this.t=t;  
	}  
	public void run(){  
		t.printTable(100);  
	}  
}  
