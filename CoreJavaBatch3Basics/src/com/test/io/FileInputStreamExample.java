package com.test.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
	
	public static void main(String[] args) {
		File file = new File("sample.txt");
		try {
			FileInputStreamExample s = new FileInputStreamExample();
			FileInputStream fis = new FileInputStream(file);
			System.out.println("Total file size to read (in bytes) : "+ fis.available());
			int content;
			while ((content = fis.read()) != -1) {
				System.out.print((char) content);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
