package com.nit.basic.maths;

public class Factorial {

	public static int fact(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		int fact = fact(6);
		System.out.println(fact);
	}

}
