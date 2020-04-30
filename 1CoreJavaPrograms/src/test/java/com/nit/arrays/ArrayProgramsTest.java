package com.nit.arrays;

import org.junit.Assert;
import org.junit.Test;

public class ArrayProgramsTest {

	@Test
	public void testInsert() {
		int[] ia = ArrayPrograms.insert(new int[] { 10, 20, 30, 40, 50 }, 3, 150);
		Assert.assertArrayEquals(new int[] { 10, 20, 150, 30, 40, 50 }, ia);
	}

	@Test
	public void testDelete() {
		int[] ia = ArrayPrograms.delete(new int[] { 10, 20, 30, 40, 50 }, 1);
		Assert.assertArrayEquals(new int[] { 20, 30, 40, 50 }, ia);
	}

	@Test
	public void testReverse() {
		Assert.assertArrayEquals(new int[] { 30, 20, 10 }, ArrayPrograms.reverse(new int[] { 10, 20, 30 }));
		Assert.assertArrayEquals(new int[] { 0, 0, 0 }, ArrayPrograms.reverse(new int[] { 0, 0, 0 }));
		Assert.assertArrayEquals(null, ArrayPrograms.reverse(null));
		Assert.assertArrayEquals(ArrayPrograms.reverse(new int[] { }), ArrayPrograms.reverse(new int[] { }));
	}

	@Test
	public void testFindMax() {
		int result = ArrayPrograms.findMax(new int[] { 10, 20, 30, 40, 50 });
		int expected = 50;
		Assert.assertEquals(expected, result);
		Assert.assertEquals(0, ArrayPrograms.findMax(new int[] {}));
		Assert.assertEquals(0, ArrayPrograms.findMax(null));
	}

	@Test
	public void testFindMin() {
		Assert.assertEquals(3, ArrayPrograms.findMin(new int[] { 10, 5, 7, 9, 3 }));
		Assert.assertEquals(5, ArrayPrograms.findMin(new int[] { 10, 5 }));
		Assert.assertEquals(5, ArrayPrograms.findMin(new int[] { 5 }));
	}

	@Test
	public void testFindSecondMax() {
		Assert.assertEquals(40, ArrayPrograms.findSecondMax(new int[] { 50, 10, 20, 30, 40, 50 }));
		Assert.assertEquals(50, ArrayPrograms.findSecondMax(new int[] { 10, 10, 10, 50, 70 }));
		// Assert.assertEquals(10, ArrayPrograms.findSecondMax(new int[] {10,10,10}));
	}

	@Test
	public void testFindSecondMin() {
		Assert.assertEquals(20, ArrayPrograms.findSecondMin(new int[] { 50, 10, 20, 30, 40, 50 }));
		Assert.assertEquals(50, ArrayPrograms.findSecondMin(new int[] { 10, 10, 10, 50, 70 }));
		// Assert.assertEquals(10, ArrayPrograms.findSecondMin(new int[] {10,10,10}));
	}

	@Test
	public void testSort() {
		Assert.assertArrayEquals(new int[] { 10, 20, 30, 40 }, ArrayPrograms.sort(new int[] { 40, 30, 20, 10 }));
		Assert.assertArrayEquals(null, ArrayPrograms.sort(null));
		Assert.assertArrayEquals(new int[] { 40 }, ArrayPrograms.sort(new int[] { 40 }));
	}

//	@Test
//	public void testRemoveDuplicateElements() {
//		Assert.fail("Not yet implemented");
//	}

}
