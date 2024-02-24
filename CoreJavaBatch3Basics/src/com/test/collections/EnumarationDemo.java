package com.test.collections;

import java.util.Enumeration;
import java.util.Vector;

public class EnumarationDemo {

	
	public static void main(String[] args) {
		
		Vector v = new Vector<>();
		v.add(12);
		v.add("abc");
		v.add(true);
		//System.out.println(v);
		Enumeration e = v.elements();
		
		while (e.hasMoreElements()) {
			Object object = (Object) e.nextElement();
			System.out.println(object);
			
		}
		
	}
}
