package com.recepkabakci.corejava;

public class EndlessHello {

	public static void main(String[] args) {
		sayHello(1);
	}

	private static void sayHello(int counter) {
		System.out.println(counter + ". Hello");
		sayHello(++counter);
	}
}
