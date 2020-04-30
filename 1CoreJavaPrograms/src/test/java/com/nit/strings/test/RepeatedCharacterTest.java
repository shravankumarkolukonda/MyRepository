package com.nit.strings.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class RepeatedCharacterTest {

	@Test
	public void testRepeatedCharacter() {
		Map<Character, Integer> expected = new HashMap<Character, Integer>();
		expected.put('a', 2);
		expected.put('b', 2);
		expected.put('c', 1);

	}

}
