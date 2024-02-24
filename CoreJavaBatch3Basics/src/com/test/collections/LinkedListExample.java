package com.test.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class LinkedListExample {

	
public static void main(String[] args) {
		
		List<String> fruits = new LinkedList<>(); 
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Orange");
		fruits.add(null);
		fruits.remove(0);

		System.out.println(fruits);
		
		Stack s = new Stack<>();
		s.push(1);
		s.push("xyz");
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s.empty());
		System.out.println(s);
	}
}
