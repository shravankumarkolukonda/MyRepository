package com.nit.multithreading;

public class Thread2 implements Runnable {
	DeadLockDemo2 d;

	public Thread2(DeadLockDemo2 d) {
		this.d = d;
	}

	public void run() {
		DeadLockDemo2.m2();
	}
}
