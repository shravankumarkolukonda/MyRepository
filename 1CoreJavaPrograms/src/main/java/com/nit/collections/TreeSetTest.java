package com.nit.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setId(101);
		e1.setName("chiru");
		e1.setSalary(10000);

		Employee e2 = new Employee();
		e2.setId(102);
		e2.setName("balayya");
		e2.setSalary(20000);

		Employee e3 = new Employee();
		e3.setId(103);
		e3.setName("nag");
		e3.setSalary(30000);

		Employee e4 = new Employee();
		e4.setId(104);
		e4.setName("Venky");
		e4.setSalary(3000);

		Set<Employee> s = new TreeSet<Employee>(new Employee());
		s.add(e1);
		s.add(e2);
		s.add(e3);

		for (Employee e : s)
			System.out.println(e + "\n");
	}

}
