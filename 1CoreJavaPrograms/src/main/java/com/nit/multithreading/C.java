package com.nit.multithreading;

public class C {

	public void print101To150() {
		for (int i = 101; i <= 150; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
