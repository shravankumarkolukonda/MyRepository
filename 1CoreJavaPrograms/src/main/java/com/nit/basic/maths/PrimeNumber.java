package com.nit.basic.maths;

public class PrimeNumber {

	public static void isPrime(int num) {

		int count = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count = count + 1;
			}
		}

		if (count == 2) {
			System.out.println(num + " is a prime number");
		} else {
			System.out.println(num + " is not a prime number");
		}
	}

	public static void printPrimeNumbers(int num) {

		for (int i = 1; i <= num; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count = count + 1;
				}
			}

			if (count == 2) {
				System.out.println(i);
			}
		}

	}

	public static void main(String[] args) {
		printPrimeNumbers(20);

	}

}
