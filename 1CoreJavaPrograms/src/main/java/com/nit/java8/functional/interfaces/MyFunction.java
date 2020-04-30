package com.nit.java8.functional.interfaces;

import java.util.function.Function;

public class MyFunction implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer i) {
		return i + 5;
	}

}
