package com.nit.java8.functional.interfaces;

import java.util.function.Consumer;

public class MyConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer i) {
		System.out.println(i);
	}

}
