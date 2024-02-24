package com.test.OOPS;


public class Dog extends Animal {

	public void displayInfo() {
		System.out.println("I am a dog.");
	}
	public void d1(String a){
		System.out.println("this is not overridden");
	}
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.displayInfo();
		
		Animal a = new Animal();
		a.displayInfo();
	


	}
}

