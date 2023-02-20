package com.recepkabakci.corejava;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Input a string: ");
		char[] str=scan.nextLine().toCharArray();
		scan.close();
		for(int i=str.length-1;i>=0;i--) {
			System.out.print(str[i]);
		}
		
	}

	
	

}
