package com.test.accessmodifilers;

public class PrivateDemo {

	private int id = 40;
	
	

	private String sayHi() {
		System.out.println("Hi java");
		return "Hi";
	}
	
	// constructor 
	 private PrivateDemo(){
	System.out.println("Helllo I am cons");
	}  

	 public static void main(String[] args) {
		
		 PrivateDemo d = new PrivateDemo();
		 System.out.println(d.id);
		 System.out.print(d.sayHi());
	}
}