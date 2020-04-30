package com.nit.p1;

public class B extends A {
	public void m1() {
		System.out.println("B class m1 method");
	}

	public static void main(String[] args) {

		A a = new B();
		a.m1();

	}

}
