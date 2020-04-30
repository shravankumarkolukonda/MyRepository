package com.nit.multithreading;

public class PrintMessage {
	public synchronized void pringMsg(String msg) {
		System.out.print("[");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(msg+"]");
	}
}
