package com.recepkabakci.corejava;

import java.util.Scanner;

public class StringToInteger {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Input a number : ");
		String str =scan.nextLine();
		scan.close();
		System.out.println(Integer.parseInt(str));
	}

}
