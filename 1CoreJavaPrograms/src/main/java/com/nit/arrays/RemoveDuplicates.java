package com.nit.arrays;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {

	public static List<Integer> removeDuplicates(List l) {
		if (l == null || l.size() <= 1) {
			return l;
		}
		for (int i = 0; i < l.size(); i++) {
			for (int j = i + 1; j < l.size(); j++) {
				if (l.get(i) == l.get(j)) {
					l.remove(j);
					j--;
				}
				l.add(30);
			}
		}

		return l;
	}

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(30);
		List l = removeDuplicates(al);
		System.out.println(l);
	}

}
