package com.nit.iostreams;

import java.io.BufferedReader;

import java.io.FileReader;

import java.util.HashMap;

public class WordChange {

	public static void characterCount(String fn) throws Exception {
        
		if(fn==null)
			return;
		
		BufferedReader br = new BufferedReader(new FileReader(fn));

		StringBuilder sb = new StringBuilder();

		while (br.ready()) {
			sb.append(br.readLine());
		}
		String s = sb.toString();
		char[] arr = s.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (hm.containsKey(arr[i])) {
				int count = hm.get(arr[i]);
				hm.put(arr[i], count + 1);
			} else {
				hm.put(arr[i], 1);
			}
		}

		System.out.println(hm);
	}

	public static void main(String[] args) throws Exception {
		characterCount("test.txt");
	}

}
