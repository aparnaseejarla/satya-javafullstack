package com.java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExamples {

	public static void main(String[] args) {

		// Java 8 Filter Example: Counting Empty String

		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
		long count = strList.stream() .filter(x -> x.isEmpty()) .count();
		System.out.println("Count of ::......."+count);
		//Java 8 Filter Example 2: Count String whose length is more than three

		long num = strList.stream()
				.filter(x -> x.length()> 3)
				.count();
		System.out.println("Count of length > 3 ::......."+num);

		// String starts with a

		long acount = strList.stream()
				.filter(x -> x.startsWith("a"))
				.count();
		System.out.println("Strings start with a ......."+acount);

		//Convert String to uppercase and Join them with coma

		List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada"); 
		String G7Countries = G7.stream() .map(demo -> demo.toUpperCase()) .collect(Collectors.joining(", "));
		System.out.println("List of G7 countries ........"+G7Countries);

	}

}
