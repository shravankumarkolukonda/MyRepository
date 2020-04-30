package com.nit.innerclasses;

public class AnonymousInnerClass {

	static int a = 10;
	int b = 20;

	static void m1() {
		System.out.println("outer class static m1 method...");
	}

	void m2() {
		System.out.println("outer class non-static m2 method");
	}

	void m3() {
		int c = 30;
		Thread t = new Thread() {

			// static variables, static blocks, static methods, and constructor are not
			// allowed

			static final int d = 40;
			int e = 50;

			{
				System.out.println("non-static block...");
			}

			public void m3() {
				System.out.println(a);
				System.out.println(c);
				System.out.println(d);
				System.out.println(e);
				m1();
				
				// m2();

			}

			public void run() {
				m3();
			}
		};

		t.start();
	}

	public static void main(String[] args) {
		AnonymousInnerClass aic = new AnonymousInnerClass();
		aic.m3();
	}

}
