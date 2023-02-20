package com.recepkabakci.corejava;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long  var1=scanner.nextLong();
		String operator=scanner.next();
		long var2=scanner.nextLong();
		scanner.nextLine();
		scanner.close();
		switch (operator) {
	    case "+":
	        System.out.println(var1+var2);
	        break;
	    case "-":
	        System.out.println(var1-var2);
	        break;
	    case "/":
	    	if(var2==0) {
	    		System.out.println("Division by 0!");
	    	}else {
	       System.out.println(var1/var2);
	    	}
	        break;
	    case "*":
	    	System.out.println(var1*var2);
	    	break;
	    default:
	    	System.out.println("Unknown operator");
	        break;	        
		}								
	}
}
