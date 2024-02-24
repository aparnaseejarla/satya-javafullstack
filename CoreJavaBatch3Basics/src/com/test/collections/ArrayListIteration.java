package com.test.collections;

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

public class ArrayListIteration {

	public static void main(String[] args) {

		// create ArrayList object
		List<String> fruits = new ArrayList<>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("mango");
		fruits.add("orange");
		fruits.add("Watermelon");
		fruits.add("Strawberry");

		
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
			System.out.println("............."+fruit);
		}
		
		while (listIterator.hasNext()) {
			String fruit = (String) listIterator.next();
			System.out.println(fruit);
		} 
	}
}
