package com.aj.practice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WithFile {
	public static void main(String[] args) throws IOException {
		String content = "madhu";

		File file = new File("E:\\Users\\new.text");
		if (!file.exists()) {
			file.createNewFile();
		}
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.append(content);
		bw.write(content);
		bw.close();
		System.out.println("done");
	}
}
