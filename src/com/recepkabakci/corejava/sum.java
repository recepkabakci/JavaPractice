package com.recepkabakci.corejava;



public class sum {
			public static void main(String[] args) {
		int sum=2;
		int count=0;
		while(count<100) {		for(int i=3;i<100;i++) {
			for(int j=2;j<i;j++) {
				if(i%j!=0) {
					count++;
					sum+=i;
				}
			}
		}	
		}
		System.out.println(sum);
			
	}
}
