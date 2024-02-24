package com.test.constructors;

public class Employee {

	private int eid;
	private String ename;


	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
		System.out.println(ename);
	}

	public Employee(){

	}

	public void print(int id ,String name){
		System.out.println(id);
		System.out.println(name);
	}


	public static void main(String[] args) {

		Employee e1 = new Employee();
		Employee e2 = new Employee(4, "test1");

		e1.print(3, "test1234");
		
	}

}
