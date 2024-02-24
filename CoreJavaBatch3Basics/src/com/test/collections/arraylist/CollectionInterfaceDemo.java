package com.test.arraylist;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterfaceDemo {

	public static void main(String[] args) {

		Collection<String> fruitCollection = new ArrayList<>();
		fruitCollection.add("banana");
		fruitCollection.add("apple");
		fruitCollection.add("mango");
		System.out.println(fruitCollection);
		
		fruitCollection.remove("banana");
		System.out.println(fruitCollection);
		
		System.out.println(fruitCollection.contains("apple"));
		
		
		fruitCollection.clear();
		
		System.out.println(fruitCollection);
	}

}
