package com.test.strings;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String args[]){  
		StringTokenizer st = new StringTokenizer("my name is kiran"," ");  
		while (st.hasMoreTokens()) {  
			System.out.println(st.nextToken());  
		}  
		} 
	} 

