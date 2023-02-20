package com.recepkabakci.corejava;

import java.util.Scanner;

public class Final {
	 public static String concatStrings(String str1, String str2) {
		 String str="";
		 if(str1==null & str2==null) {
			 	str="";
		 }
		 else if(str1==null){
	           str=str2;
		 }
	       else if(str2==null){	           
	        str=str1;
	       }else {
	    	   str=str1.concat(str2);
	       }

	        return str;
	    }

	    /* Do not change code below */
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        String str1 = scanner.nextLine();
	        String str2 = scanner.nextLine();
	        str1 = "null".equalsIgnoreCase(str1) ? null : str1;
	        str2 = "null".equalsIgnoreCase(str2) ? null : str2;

	        System.out.println(concatStrings(str1, str2));
	    }
}
