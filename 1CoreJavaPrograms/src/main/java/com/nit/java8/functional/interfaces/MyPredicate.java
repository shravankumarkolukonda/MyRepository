package com.nit.java8.functional.interfaces;

import java.util.function.Predicate;

public class MyPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer i) {
		System.out.println("control entred into test...");
		return i > 30;
	}

}
