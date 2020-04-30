package com.nit.java8.functional.interfaces;

import java.util.function.Supplier;

public class MySupplier implements Supplier<Integer> {

	@Override
	public Integer get() {
		
		return (int) Math.random();
	}

}
