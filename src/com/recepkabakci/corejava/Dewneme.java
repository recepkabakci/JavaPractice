package com.recepkabakci.corejava;

import java.util.Scanner;

public class Dewneme {
	public static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the number of rows:");
		int n= scanner.nextInt();
		System.out.println("Enter the number of seats in each row:");
		int m= scanner.nextInt();
		System.out.println();
		String nums[][]= new String[n][m];
		menu();
		showSeats(n,m);
		buyTicket( n,m);
	}
	public static void menu() {
		
		System.out.println("1. Show the seats");
		System.out.println("2. Buy a ticket");
		System.out.println("0. Exit");
		int num=scanner.nextInt();
		int n=0;
		int m=0;
		while(num!=0) {
			switch(num) {
			case 1:
				showSeats(n,m);
				break;
			case 2:
				buyTicket(n,m);
				break;
			case 0:	
				break;		
			}
			menu();
		}
	}
	public static void showSeats(int n,int m) {
		String nums[][]= new String[n][m];
		for (int i = 1; i < m + 1; i++) {
	        if (i == 1) {
	            System.out.print("  ");
	        }
	        System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 0; i < nums.length; i++) {
	        for (int j = 0; j < nums[i].length; j++) {
	            if (j == 0) {
	            	nums[i][j]=Integer.toString(i+1);
	            	System.out.print(nums[i][j] + " ");
	            }
	            nums[i][j]="S";
	            System.out.print(nums[i][j] + " ");
	        }
	    System.out.println();
		}	
	}
	public static void buyTicket(int n,int m) {
		String nums[][]= new String[n][m];
		System.out.println("Enter a row number:");
		int x= scanner.nextInt();
		System.out.println("Enter a seat number in that row:");
		int y= scanner.nextInt();
	
		System.out.println();
		if(n*m<=60) {
				System.out.println("Ticket price: $10");			
		}else {
			if(n%2==0) {
				if((n/2)>=x) {
					System.out.println("Ticket price: $10");
				}else {
					System.out.println("Ticket price: $8");
				}
			}else {
				if(((n-1)/2)>=x) {
					System.out.println("Ticket price: $10");
				}else {
					System.out.println("Ticket price: $8");
				}
			}
		}
		System.out.println();
		System.out.println("Cinema:");
		nums[x-1][y-1]="B";
		
		for (int i = 1; i < m + 1; i++) {
	        if (i == 1) {
	            System.out.print("  ");
	        }
	        System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 0; i < nums.length; i++) {
	        for (int j = 0; j < nums[i].length; j++) {
	            if (j == 0) {
	            	nums[i][j]=Integer.toString(i+1);
	            	System.out.print(nums[i][j] + " ");
	            }
	            if(nums[i][j]==nums[x-1][y-1]) {
	            nums[i][j]="B";
	            }else {
	            	 nums[i][j]="S";
	            }
	            System.out.print(nums[i][j] + " ");
	        }
	    System.out.println();
		}
	}

}
