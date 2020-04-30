package com.nit.basic.maths;

public class NumberReverse {

	public static int revNum(int num) {
		int rev = 0;

		while (num != 0) {
			int d = num % 10;
			rev = (rev * 10) + d;
			num = num / 10;
		}

		return rev;

	}

	public static void main(String[] args) {
		int num = revNum(1234);
		System.out.println(num);
	}

}
