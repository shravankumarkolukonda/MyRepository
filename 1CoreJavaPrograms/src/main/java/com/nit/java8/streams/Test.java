package com.nit.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void print(List<Integer> l, int x) {
		for (int i = 0; i < l.size(); i++) {
			if (l.get(i) > 30) {
				System.out.println(l.get(0));
			}
		}
	}

	public static boolean m2(List<Integer> l, int x) {
		return l.contains(x);
	}

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEid(101);
		e1.setEname("chiru");
		e1.setEsal(5000);

		Employee e2 = new Employee();
		e2.setEid(102);
		e2.setEname("ballaya");
		e2.setEsal(6000);

		Employee e3 = new Employee();
		e3.setEid(103);
		e3.setEname("nag");
		e3.setEsal(7000);

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(30);
		al.add(20);
		al.add(10);

		boolean b = Test.m2(al, 10);
		System.out.println(b);
		
	}

}
