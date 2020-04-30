package com.nit.basic.programs.maths;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.nit.basic.maths.Factorial;

public class FactorialTest {

	@Test
	public void testFact() {
		int act = Factorial.fact(5);
		int exp = 120;
		assertEquals(exp, act);
		assertEquals(1, Factorial.fact(0));
	}

}
