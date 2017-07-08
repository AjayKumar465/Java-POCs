package com.aj.practice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class CreatePropertyfile {
	public static void main(String[] args) throws IOException {
		OutputStream os = null;
		Properties props = new Properties();
        props.setProperty("ajay", "k");
        props.setProperty("anil", "k");
        props.setProperty("madhu", "k");
        os=new  FileOutputStream("Myprops.properties");
        props.store(os, "DynamicPropertyFile");
        System.out.println("done");
	}
}
