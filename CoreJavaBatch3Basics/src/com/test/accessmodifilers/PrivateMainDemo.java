package com.test.accessmodifilers;

public class PrivateMainDemo {
	
	 public static void main(String args[]){  
		   PrivateDemo obj=new PrivateDemo();  
		 //Compile Time Error  
		 System.out.println(obj.id);
		   //Compile Time Error  
		   obj.sayHi();
		   }  
		}  


