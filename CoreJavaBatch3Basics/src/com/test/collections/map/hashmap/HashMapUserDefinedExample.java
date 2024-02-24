package com.test.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapUserDefinedExample {
	public static void main(String[] args) {
		
		// create hashmap
		
		Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
		
		studentMap.put(1, new Student("Ramesh", "M"));
		studentMap.put(2, new Student("Tony", "T"));
		studentMap.put(3, new Student("umesh", "U"));
		
		System.out.println(studentMap.values());
		
		
	}
}
