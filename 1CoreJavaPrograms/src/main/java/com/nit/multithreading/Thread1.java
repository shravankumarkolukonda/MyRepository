package com.nit.multithreading;

public class Thread1 implements Runnable {
	DeadLockDemo2 d;
	

	public Thread1(DeadLockDemo2 d) {
		this.d = d;
	}

	public void run() {
		DeadLockDemo2.m1();
	}
}
