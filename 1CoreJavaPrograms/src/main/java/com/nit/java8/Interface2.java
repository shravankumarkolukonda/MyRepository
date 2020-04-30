package com.nit.java8;

public interface Interface2 {
	public abstract int m1();

	public default void log(String str) {
		System.out.println("I2 logging..." + str);
	}
}
