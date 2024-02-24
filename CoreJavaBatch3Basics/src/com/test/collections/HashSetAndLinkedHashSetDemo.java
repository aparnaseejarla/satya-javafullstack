package com.test.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetAndLinkedHashSetDemo {

	
	public static void main(String[] args) {
		
		
		HashSet hs = new HashSet<>(); //1.hetogenios objects allowd 2.inserting order not presured 3.null aplica 4. duplicatate not allow
		hs.add(10);
		hs.add("xyz");
		hs.add(true);
		hs.add(null);
		hs.add(10);
		System.out.println(hs);
		System.out.println(hs.size());
		
		LinkedHashSet lhs = new LinkedHashSet<>(); //1.hetogenios objects allowd 2.inserting order  presured 3.null aplica 4. duplicatate not allow
		lhs.add(10);
		lhs.add("xyz");
		lhs.add(true);
		lhs.add(null);
		lhs.add(10);
		System.out.println(lhs);
		System.out.println(lhs.size());
		
		TreeSet ts = new TreeSet<>();
		
		ts.add(8);
		ts.add(99);
		ts.add(77);
		ts.add(1);
		ts.add(null);
		//ts.add(null);

		System.out.println(ts);
		
		
	}
}
