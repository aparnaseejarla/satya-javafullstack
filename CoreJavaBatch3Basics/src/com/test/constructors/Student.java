package com.test.constructors;

public class Student {

	int id;  
	String name;  
	int age; 
	float sal;
	
	Student(int i){  
		System.out.println(i);
		id = i;  
	}  
	
	static void display1() {
		
		System.out.println("this is static method");
	}
	
	Student(int i,String n,int a){  
		id = i;  
		name = n;  
		age=a;  
		System.out.println(i);
		System.out.println(n);
		System.out.println(a);
	} 
	
	
	Student(int i,String n,int a,float s1){  
		id = i;  
		name = n;  
		age=a;  
		sal=s1;
		System.out.println(i);
		System.out.println(n);
		System.out.println(a);
		System.out.println(s1);
	}  
	
	void display(){
		System.out.println(id+" "+name+" "+age);
		}  

	public static void main(String args[]){  
		Student s1 = new Student(111);  
		Student s2 = new Student(222,"Aryan",25);  
		Student s3 = new Student(11,"test", 1,123);
		
		s1.display();
		s2.display();
		Student.display1();
		
		
	}  
}
