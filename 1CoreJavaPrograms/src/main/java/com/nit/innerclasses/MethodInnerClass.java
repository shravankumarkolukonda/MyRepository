package com.nit.innerclasses;

public class MethodInnerClass {
	public void m1() {
		final int a = 10;
		      int b = 20;
		class A {
			public static final int c = 10;
			// static int d= 20;
			int e = 30;
			{
				System.out.println("non-static block...");
			}

			public A() {
				System.out.println("Constructor...");
			}

			public void m1() {
				System.out.println(c);
			}

			void m2() {
				System.out.println("m2...");
			}
		}
	}

	public static void main(String[] args) {
		MethodInnerClass mic = new MethodInnerClass();
		mic.m1();
	}

}
