package com.nit.multithreading;

public class ITCTest {

	public static void main(String[] args) {
		Factory fac = new Factory();
		Producer p = new Producer(fac);
		Consumer c = new Consumer(fac);

	}

}
