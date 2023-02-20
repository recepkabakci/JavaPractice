package com.recepkabakci.corejava;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		scan.close();
		if(num%2==0) {
			System.out.println(num+" is even number.");
		}else {
			System.out.println(num+" is odd number.");
		}
	}

}
