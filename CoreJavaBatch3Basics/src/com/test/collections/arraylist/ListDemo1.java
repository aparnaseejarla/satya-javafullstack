package com.test.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
	
	public static void main(String[] args) {
		
		List list = new ArrayList<>();
		
		
		
		// insertion order
		list.add("element1"); // 0
		list.add("element1"); // 1
		list.add("element4"); // 2
		list.add("element3"); // 3
		list.add("element5"); // 4
		list.add(1);
		list.add(true);
		list.add(10.30);
		
		
		
		System.out.println(list);
		
		// access elements from list
		
		System.out.println(list.get(0));
		System.out.println(list.get(4));

	}
}
