package com.nit.collections;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class ArrayListExTest {

	@Test
	public void testRemoveDuplicates() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(10);
		al.add(20);

		List<Integer> l = ArrayListEx.removeDuplicates(al);

		Assert.assertEquals(3, l.size());

	}

}
