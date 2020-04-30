package com.nit.multithreading;

public class DeadLockDemo2 {
	public synchronized static void m1() {
		System.out.println("static m1 method");
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 5) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public synchronized static void m2() {
		System.out.println("static m2 method");
	}
}
