package com.nit.arrays;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesTest {

	@Test
	public void testRemoveDuplicates() {
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(30);

		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(10);
		al2.add(20);
		al2.add(30);
		Assert.assertEquals(al2, RemoveDuplicates.removeDuplicates(null));
	}

}
