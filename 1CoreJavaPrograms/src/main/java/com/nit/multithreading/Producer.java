package com.nit.multithreading;

public class Producer implements Runnable {
	Factory factory;

	Producer(Factory factory) {
		this.factory = factory;
		Thread th = new Thread(this);
		th.start();
	}

	@Override
	public void run() {
		int i = 1;
		while (i <= 10) {
			factory.produce(i++);
		}
	}

}
