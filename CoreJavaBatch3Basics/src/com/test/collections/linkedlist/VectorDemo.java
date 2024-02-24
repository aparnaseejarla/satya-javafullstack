package com.test.linkedlist;

import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> animals= new Vector<>();

		// Using the add() method
		animals.add("Dog");
		animals.add("Horse");

		// Using index number
		animals.add(2, "Cat");
		System.out.println("Vector: " + animals);

		// Using addAll()
		Vector<String> animals1 = new Vector<>();
		animals1.add("Crocodile");
		animals1.add("test");
		
		animals.addAll(animals1);
		System.out.println("New Vector: " + animals);
		
		
	}
}
