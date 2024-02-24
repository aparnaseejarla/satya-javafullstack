package com.test.set.linkedhashet;

import java.util.LinkedHashSet;

public class LinkedHashSetDemoCreation {

	public static void main(String[] args) {
		
		LinkedHashSet<String> countries = new LinkedHashSet<>();
		countries.add("US");
		countries.add("INDIA");
		countries.add("CANADA");
		countries.add("AUS");
		countries.add("CAL");
		System.out.println(countries);

	}
}
