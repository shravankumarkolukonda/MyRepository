package com.nit.multithreading;

public class Thread3 extends Thread {
	private C c;

	public Thread3(C c) {
		this.c = c;
	}

	public void run() {
		c.print101To150();
	}

}
