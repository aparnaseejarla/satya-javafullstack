package com.test.set.hashset;

import java.util.HashSet;
import java.util.Set;

public class CreateHashSetExample {

	public static void main(String[] args) {
		
		// create a HashSet using the HashSet() constructor 
		// add new elements to it using the add() method.
		
		// unordered collection
		Set<String> programmingLanguages = new HashSet<>();

		programmingLanguages.add("C");
		programmingLanguages.add("C++");
		programmingLanguages.add("Java");
		programmingLanguages.add("Python");
		programmingLanguages.add("Scala");
		programmingLanguages.add("JavaScript");
		
		Set<String> programmingLanguages1 = new HashSet<>();

		programmingLanguages1.add("C1");
		programmingLanguages1.add("C+11+");
		programmingLanguages1.add("Ja11va");
		programmingLanguages1.add("Python11");
		programmingLanguages1.add("Scala11");
		programmingLanguages1.add("JavaScript11");

		programmingLanguages.addAll(programmingLanguages1);
		
		System.out.println(programmingLanguages1);
		
		// let's add duplicate element
		programmingLanguages.add("Java");
		programmingLanguages.add(null);

		System.out.println(programmingLanguages);
	}

}
