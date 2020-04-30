package com.nit.multithreading;

public class DaemonDemo implements Runnable {

	public DaemonDemo() {
		Thread th = new Thread(this);
		th.setDaemon(true);
		th.setName("Daemon Thread");
		th.start();
	}

	@Override
	public void run() {

		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + i);
		}
	}

	public static void main(String[] args) {
		new DaemonDemo();

		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + i);
		}

	}

}
