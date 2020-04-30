package com.nit.basic.programs.maths.test;

import org.junit.Assert;
import org.junit.Test;

import com.nit.basic.maths.Factorial;

public class TestFactorial {

	@Test
	public void testFact() {
		Assert.assertEquals(120, Factorial.fact(5));
		Assert.assertEquals(1, Factorial.fact(0));
		Assert.assertEquals(1, Factorial.fact(1));
		
	}

}
