package com.test.io;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderExample {
	public static void main(String[] args) {
		try {
			//Reading data
			 File file = new File("C:/myfile.txt");
			FileReader reader = new FileReader(file);
			BufferedReader br = new BufferedReader(reader);
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
