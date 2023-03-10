package com.recepkabakci.corejava;

public class CountOdd {

	public static void main(String[] args) {
		System.out.println(countOdds(5,7));
	  }
	
		
		   public static int countOdds(int low, int high) {
		        int sum =0;
		        for (int i=low;i<=high;i++){
		            if(i%2!=0){
		                sum++;
		            }
		        }
		        return sum;
		    }

	

}
