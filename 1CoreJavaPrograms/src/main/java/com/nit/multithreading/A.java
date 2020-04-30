package com.nit.multithreading;

public class A {
	static {
		System.out.println("name: " + Thread.currentThread().getName());
	}

	public void print1To50() {
		for (int i = 1; i <= 50; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
