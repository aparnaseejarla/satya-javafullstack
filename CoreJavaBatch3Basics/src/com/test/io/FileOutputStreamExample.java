package com.test.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Logger;

public class FileOutputStreamExample {


	public static void main(String[] args) {
		File file = new File("C://sample1.json");
		String content = "This is the text content";

		try {
			OutputStream fop = new FileOutputStream(file);
			if (!file.exists()) {
				System.out.println("New file is created "+file.getName());
				file.createNewFile();
			}
			// get the content in bytes
			byte[] contentInBytes = content.getBytes();

			fop.write(contentInBytes);
			System.out.println("Done");

		} catch (IOException e) {
		}
	}
}