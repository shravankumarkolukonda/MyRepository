package com.nit.multithreading;

public class ThreadsJoining implements Runnable {
	Thread th;

	public ThreadsJoining() {
		th = new Thread(this);
		th.start();
		try {
			th.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + ": " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		System.out.println("main started...");

		ThreadsJoining t1 = new ThreadsJoining();
		ThreadsJoining t2 = new ThreadsJoining();

		System.out.println("main exited...");
	}

}
