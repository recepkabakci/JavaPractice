package com.recepkabakci.corejava;

import java.util.Scanner;

public class Mainf {
	                  // 6
	
	 public static long factorial(long n) {
	        long sum=1;
	        if(n==0) {
	        	sum=1;
	        }else {	       	
	        	for(int i=1;i<=n;i++){
	        		sum*=i;     
	        	}
	        }
	        return sum;
	    }

	    /* Do not change code below */
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        long n = Integer.parseInt(scanner.nextLine().trim());
	        System.out.println(factorial(n));
	    }
}
