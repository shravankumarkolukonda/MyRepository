package com.nit.multithreading;

public class B {
	public void print50To100() {
		for (int i = 51; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
