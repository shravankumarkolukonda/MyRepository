package com.nit.strings.test;

import org.junit.Assert;
import org.junit.Test;

import com.nit.strings.StringPrograms;

public class StringProgramsTest {

	@Test
	public void testisAnagram() {
		Assert.assertEquals(true, StringPrograms.isAnagram("pots", "stop"));
	}

}
