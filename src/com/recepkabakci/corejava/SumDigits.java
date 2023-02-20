package com.recepkabakci.corejava;

import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.print("Input an integer: ");
        long n = scan.nextLong();
        System.out.println("The sum of the digits is: " + sumDigits(n));
        scan.close();
      
		
	}
		public static int sumDigits(long n) {
			int sum=0;
			while(n!=0) {
				sum+=n%10;
				n/=10;
			}
			return sum;
		}
			
}
