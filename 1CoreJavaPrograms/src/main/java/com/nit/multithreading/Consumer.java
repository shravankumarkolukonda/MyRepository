package com.nit.multithreading;

public class Consumer implements Runnable {
	Factory factory;

	public Consumer(Factory factory) {
		this.factory = factory;
		Thread th = new Thread(this);
		th.start();
	}

	@Override
	public void run() {
		int i = 1;
		while (i <= 10) {
			factory.consume();
			i++;
		}
	}

}
