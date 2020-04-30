package com.nit.java8;

public interface Interface1 {

	public abstract int m1();

	public default void log(String str) {
		System.out.println("from interface1...");
	}

}
