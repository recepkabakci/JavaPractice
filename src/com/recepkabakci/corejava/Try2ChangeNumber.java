package com.recepkabakci.corejava;

public class Try2ChangeNumber {

	public static void main(String[] args) {
		int aNumber = 10;
		changeNumber(aNumber);
		System.out.println(aNumber);
	}

	private static void changeNumber(int aNumber) {
		aNumber = 25;
	}
}
