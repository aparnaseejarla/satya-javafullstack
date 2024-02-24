package com.test.io;

import java.io.File;

public class RenameFileExample {

	public static void main(String[] args) {
		renameFile();
	}

	// Renames the file denoted by this abstract pathname.
	public static void renameFile() {
		File file = new File("C:/workspace/java-io-guide/sample.txt");
		boolean hasRename = file.renameTo(new File("C:/workspace/java-io-guide/sample2.txt"));
		if (hasRename) {
		} else {
		}
	}
}
