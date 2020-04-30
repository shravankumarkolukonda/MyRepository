package com.nit.java8;

public class A extends Object implements Interface1 {

	@Override
	public int m1() {
		return 0;
	}

	@Override
	public void log(String str) {
		System.out.println("from impl...");
	}
	
}
