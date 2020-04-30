package com.nit.multithreading;

public class Factory {
	int items;
	boolean itemsInFactory;

	public synchronized void produce(int items) {
		if (itemsInFactory) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		notify();
		this.items = items;
		System.out.println("Items Produced: " + items);
		
		itemsInFactory = true;
		
	}

	public synchronized void consume() {
		if (!itemsInFactory) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Items Consumed: " + items);
		itemsInFactory = false;
		notify();
	}
}
