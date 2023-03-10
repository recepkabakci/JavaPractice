package com.recepkabakci.corejava;



import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;


public class AvgNum {

	 public static String simplify(String input) throws UnsupportedOperationException {
	 
		StringBuilder sb = new StringBuilder();
        LinkedHashSet<Character> set = new LinkedHashSet<>();   
        
        for(int i=0;i<input.length();i++)   
            set.add(input.charAt(i));   
            
       
        for(Character ch : set)     
        	sb.append(ch);
        return sb.toString();
    }   
			 
			 
		
		
	    

	    public static void main(String[] args) {
	    	
	    	 System.out.println(AvgNum.simplify("ghhrkkb"));
	        
	    }
	}