package com.nit.innerclasses;

public class Outer {
	// static inner class
	static class A {

	}

	// nonstatic inner class
	class B {

	}

	//
	void m1() {
		// method local inner class
		class C {

		}
		// Anonymous inner class
		m2(new Thread() {
			public void run() {
				System.out.println("run");
			} 
		});
	}

	void m2(Runnable t) {
		t.run();
	}

	public static void main(String[] args) {
		Outer o = new Outer();
		o.m1();
	}

}
