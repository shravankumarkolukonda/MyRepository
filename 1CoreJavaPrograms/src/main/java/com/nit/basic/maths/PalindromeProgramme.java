package com.nit.basic.maths;

public class PalindromeProgramme {

	public static String checkPalindorme(int num) {
		int temp = num;
		int rev = 0;
		while (num != 0) {
			int d = num % 10;
			rev = (rev * 10) + d;
			num = num / 10;
		}

		if (rev == temp) {
			return temp + " is palindrome number";
		} else {
			return temp + " not a palindrome number";
		}
	}

	public static void printPalindorme(int num) {

		for (int i = 1; i <= num; i++) {
			int num1 = i;
			int act = num1;
			int rev = 0;
			while (num1 != 0) {
				int d = num1 % 10;
				rev = (rev * 10) + d;
				num1 = num1 / 10;
			}

			if (act == rev) {
				System.out.println(act + " is palindrome number");
			} else {
				System.out.println(act + " not a palindrome number");
			}
		}
	}

	public static void main(String[] args) {
		printPalindorme(11);
	}

}
