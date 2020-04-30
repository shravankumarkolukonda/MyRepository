package com.nit.multithreading;

public class MessagePrinterThread implements Runnable {
	String msg;
	PrintMessage pm;
	Thread th;

	public MessagePrinterThread(String msg, PrintMessage pm) {
		this.msg = msg;
		this.pm = pm;
		th = new Thread(this);
		th.start();
	}

	public void run() {
		pm.pringMsg(msg);
	}

}
