package com.nit.innerclasses;

public class A {
	static int a = 10;
	int b = 20;

	static class B {

		B() {

		}

		static final int c = 30;
		int d = 40;

		public void m2() {
	//		System.out.println(b);
			System.out.println("B class m1 method...");
		}
		
		public static void m1() {
			
		}
	}

	public static void main(String[] args) {

	}

}
