package com.nit.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class A {

	public static void main(String[] args) {
		List<Integer> iList = new ArrayList<Integer>();
		iList.add(10);
		iList.add(20);
		iList.add(30);

		List<Double> dList = new ArrayList<Double>();
		dList.add(77.25);
		dList.add(26.35);
		dList.add(137.25);

		List<String> sList = new ArrayList<String>();
		sList.add("a");
		sList.add("b");
		sList.add("c");

		Map<String, List<?>> m = new HashMap<String, List<?>>();
		m.put("k1", iList);
		m.put("k2", dList);
		m.put("k3", sList);

		Set<Map.Entry<String, List<?>>> s = m.entrySet();

		for (Map.Entry<String, List<?>> entry : s) {
			String key = entry.getKey();
			List<?> value = entry.getValue();
			System.out.print(key + ":");
			for (Object i : value)
				System.out.println(i);
			System.out.println("=================");
		}
	}

}
