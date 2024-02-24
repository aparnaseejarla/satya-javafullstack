package com.test.OOPS;

 interface InterfaceDemo {

	void print(); 
	
}  
class A implements InterfaceDemo{  
	
	public void print(){
		
		System.out.println("Hello");}  
	
	
	public static void main(String args[]){  
		
		
		A obj = new A();  
		obj.print();  
	}  } 


