package com.nit.java8.functional.interfaces;

import java.util.function.Function;

import com.nit.java8.Employee;

public class A {
	public A() {
		System.out.println("");
	}

	public int m1(int i) {
		return i + 10;
	}

	public static void m2(int i) {
		System.out.println("static m2 method..." + i);
	}

	public static void main(String[] args) {
		Function<Integer,Integer> f;
	}

}
