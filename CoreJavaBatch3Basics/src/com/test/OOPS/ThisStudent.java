package com.test.OOPS;

public class ThisStudent {

	int id;  
	String name;  


	ThisStudent(int i,String n){ 
		this.id = i;  
		this.name = n;  
	}  
	void display(){
		System.out.println(id+" "+name);

	} 
	public static void main(String[] args) {
		System.out.println("main method..........");
		ThisStudent thisStudent = new ThisStudent(1, "demo");
		thisStudent.display();
	}
}
