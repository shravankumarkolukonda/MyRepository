package com.nit.strings.test;

import org.junit.Assert;
import org.junit.Test;

import com.nit.strings.FirstNonRepeatedCharacter;

public class FirstNonRepeatedCharacterTest {

	@Test
	public void testFirstNonRepeatedCharacter() {
		char actual = FirstNonRepeatedCharacter.firstNonRepeatedCharacter("shravan");
		char expected = 's';
		Assert.assertEquals(expected, actual);
	}

}
