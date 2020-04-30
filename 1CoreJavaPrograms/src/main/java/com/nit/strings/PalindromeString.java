package com.nit.strings;

public class PalindromeString {

	public static void isPalindrome2(String s) {

		String rev = new StringBuilder(s).reverse().toString();

		System.out.println(rev == s);

		if (s.equals(rev))
			System.out.println(s + " is palindrome");
		else
			System.out.println(s + " is not palindrome");
	}

	public static void isPalindrome(String s) {

		String org = new String(s);

		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}

		if (org.equals(rev))
			System.out.println(s + " is palindrome");
		else
			System.out.println(s + " is not palindrome");
	}

	public static void main(String[] args) {
		PalindromeString.isPalindrome("shravan");

	}
}
