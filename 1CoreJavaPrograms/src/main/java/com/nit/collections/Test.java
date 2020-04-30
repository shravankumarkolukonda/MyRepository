package com.nit.collections;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {

		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("a", 1);
		m.put("a", 2);

		System.out.println(m.get("a"));
		System.out.println("Size = " + m.size());

	}
}