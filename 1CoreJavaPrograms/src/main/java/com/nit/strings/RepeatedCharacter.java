package com.nit.strings;

import java.util.HashMap;
import java.util.Map;

public class RepeatedCharacter {
	public static Map<Character, Integer> repeatedCharacter(String s) {
		char[] ch = s.toCharArray();
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {

			if (!m.containsKey(ch[i])) {
				m.put(ch[i], 1);
			} else {
				int count = m.get(ch[i]);
				m.put(ch[i], count + 1);
			}
		}
		return m;
	}

	public static void main(String[] args) {
		Map<Character, Integer> m = repeatedCharacter("abcab");
		System.out.println(m);
	}

}
