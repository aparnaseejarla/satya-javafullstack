package com.test.io;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderAndFileWriter {

	public static void main(String[] args) throws IOException{
		FileWriter fw=new FileWriter("cricket.txt",true);
		fw.write(98);//adding a single character
		fw.write("dem0 IT solutions");
		fw.write("\n");
		char[] ch={'a','b','c'};
		fw.write(ch);
		fw.write("\n");
		fw.flush();
		fw.close();

		//Reader
		FileReader fr=new FileReader("cricket.txt");
		int i=fr.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			i=fr.read();
		}
	}
}

