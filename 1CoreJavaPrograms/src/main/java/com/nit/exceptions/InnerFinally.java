package com.nit.exceptions;

public class InnerFinally {

	public static int m1() {
		try {
			System.out.println("In outer try...");
			try {
				System.out.println("In inner try...");
				System.out.println(10/0);
			} catch (NullPointerException e) {
				System.out.println("In inner catch");
			} 
		
		} catch (NullPointerException e) {
			System.out.println("In outer catch..");
		} finally {
			System.out.println("In outer finally");
		}
		System.out.println("After outer try/catch/finally");
		return 0;
	}

	public static void main(String[] args) {
		m1();
	}

}
