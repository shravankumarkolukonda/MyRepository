package com.nit.multithreading;

public class Resource2 {
	public synchronized void method1(Resource1 r1) {
		String name = Thread.currentThread().getName();
		
		System.out.println(name + " entered in to method1 of Resource2");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name+" Trying to get a lock on Resource1 object...");
		r1.method2();
	}

	public synchronized void method2() {
		System.out.println("method2 of resource2...");
	}
}
