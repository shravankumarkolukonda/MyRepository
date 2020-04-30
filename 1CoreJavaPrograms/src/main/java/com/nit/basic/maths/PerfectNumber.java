package com.nit.basic.maths;

public class PerfectNumber {
	public static void checkPerfect(int num) {

		int count = 0;

		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				count = count + i;
			}
		}

		if (count == num)
			System.out.println(num + " is a perfect number");
		else {
			System.out.println(num + " is not a perfect number");
		}
	}

	public static void printPerfectNumbers(int num) {
		for (int i = 1; i <= num; i++) {
			int count = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0)
					count = count + j;
			}

			if (count == i) {
				System.out.println(i + " is a perfect number");
			}
		}
	}

	public static void main(String[] args) {
		printPerfectNumbers(100);

	}

}
