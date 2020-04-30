package com.nit.multithreading;

public class Resource1 {
	public synchronized void method1(Resource2 r2) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " entered in to method1 of Resource1");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " Trying to get a lock on Resource2 object...");
		r2.method2();
	}

	public synchronized void method2() {
      System.out.println("method1 of resource1");
	}
}
