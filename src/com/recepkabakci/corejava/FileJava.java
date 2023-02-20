package com.recepkabakci.corejava;

import java.io.File;


public class FileJava {

	public static void main(String[] args) {
		File file= new File("abc.txt");
		
		System.out.println("/home/students/abc.txt  : " + file.length() + " bytes");
	}

}
