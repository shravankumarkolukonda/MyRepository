package com.nit.strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FirstNonRepeatedCharacter {
	// shravan
	public static char firstNonRepeatedCharacter(String s) {
		char[] ch = s.toCharArray();
		Map<Character, Integer> m = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < ch.length; i++) {
			if (!m.containsKey(ch[i])) {
				m.put(ch[i], 1);
			} else {
				int count = m.get(ch[i]);
				m.put(ch[i], count + 1);
			}
		}

		char ch1 = ' ';
		Set<Entry<Character, Integer>> set = m.entrySet();
		for (Map.Entry<Character, Integer> entry : set) {
			           
		}

		return ch1;
	}

}
