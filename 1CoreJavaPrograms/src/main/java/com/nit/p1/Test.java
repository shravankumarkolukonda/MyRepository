package com.nit.p1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test {

	public static void main(String[] args) {

		Employee e1 = new Employee(103, "chiru", 10000.00);
		Employee e2 = new Employee(101, "venky", 30000.00);
		Employee e3 = new Employee(102, "balayya", 20000.00);
		Employee e4 = new Employee(105, "nag", 40000.00);
		Employee e5 = new Employee(104, "pavan", 50000.00);

		/*
		 * int i=e1.compareTo(e2); System.out.println(i);
		 */

		Set<Employee> ts = new HashSet<>();
		ts.add(null);
		ts.add(e4);
		ts.add(e1);
		ts.add(e5);
		ts.add(e3);

		for (Employee e : ts) {
			System.out.println(e);
			System.out.println("=============");
		}

		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("a", 10);
		m.put("b", 20);
		m.put("c", 30);

		for (Map.Entry<String, Integer> entry : m.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}