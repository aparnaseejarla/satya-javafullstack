package com.test.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//for loop with index
//Simple for-each loop
//iterator()
//listIterator()
//Java 8 forEach and lambda expression.
//iterator() and Java 8 forEachRemaining() method

public class ArrayListIteration3 {

	public static void main(String[] args) {

		// create ArrayList object
		List<String> fruits = new ArrayList<>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("mango");
		fruits.add("orange");
		fruits.add("Watermelon");
		fruits.add("Strawberry");

		System.out.println("\n=== Iterate using for loop with index ===");

		//Basic for loop to loop the items
		for (int i = 0; i < fruits.size(); i++) {
			System.out.println(fruits.get(i));
		}
		
		System.out.println("\n=== Iterate using simple for-each loop ===");
		
		//This is advanced loop or foreach to loop the items
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		
		
		
		System.out.println("\n=== Iterate using an iterator() ===");
		Iterator<String> iterator = fruits.iterator();
		while (iterator.hasNext()) {
			String fruit = (String) iterator.next();
			System.out.println(fruit);
		}
		
		System.out.println("\n=== Iterate using a listIterator() to traverse in both directions ===");
		
		// Here, we start from the end of the list and traverse backwards.
		ListIterator<String> listIterator = fruits.listIterator(fruits.size());
		while (listIterator.hasPrevious()) {
			String fruit = (String) listIterator.previous();
			System.out.println(fruit);
		}
		
		while (listIterator.hasNext()) {
			String fruit = (String) listIterator.next();
			System.out.println(fruit);
		} 
	}
}
