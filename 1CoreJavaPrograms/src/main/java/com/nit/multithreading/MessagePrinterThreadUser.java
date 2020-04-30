package com.nit.multithreading;

public class MessagePrinterThreadUser {

	public static void main(String[] args) {
		PrintMessage pm = new PrintMessage();
        
		MessagePrinterThread mpt1 = new MessagePrinterThread("abc",pm);
		MessagePrinterThread mpt2 = new MessagePrinterThread("def",pm);
		MessagePrinterThread mpt3 = new MessagePrinterThread("ijk",pm);
		
		
		
	}

}
