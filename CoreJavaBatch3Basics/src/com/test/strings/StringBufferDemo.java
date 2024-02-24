package com.test.strings;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer();
		
		System.out.println(sb.capacity());//16
		sb.append("abcdefghijklmnop");
		System.out.println(sb.capacity());//16
		sb.append("q");
		System.out.println(sb.capacity());//34
		
		
		StringBuilder sb1 =new StringBuilder();
		sb1.insert(1,"demo");
		System.out.println(sb1);

	}

}
