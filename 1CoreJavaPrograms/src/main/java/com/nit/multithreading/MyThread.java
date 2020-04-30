package com.nit.multithreading;

public class MyThread extends Thread {
	int x;

	public MyThread() {
		this.x = 5;
	}

	public MyThread(int x) {
		this.x = x;
	}

	public void run() {
		for (int i = 1; i <= this.x; i++) {
			System.out.println(getName() + " " + i);
		}
	}
}
