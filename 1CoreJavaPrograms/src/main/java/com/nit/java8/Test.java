package com.nit.java8;

import java.util.function.Consumer;

import com.nit.java8.functional.interfaces.MyConsumer;

public class Test {

	public static void m1(Consumer<Integer> c, int[] ia) {
		for (int i : ia) {
			c.accept(i);
		}
	}

	public static void main(String[] args) {
		int[] x = { 0, 5, 10, 15, 20, 25, 30, 7 };

		Consumer<Integer> c = new MyConsumer();

		// Test.m1(c, x);

		for (int i = 1; i <= 10; i++) {
			double d = Math.random() * 10;
			System.out.println(d);
		}

	}

}
