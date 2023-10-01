package com.solved_Medium;

public class Remove_Occurences_ofSubstring_1910 {

	public static String removeOccurrences(String s, String part) {

		while (s.contains(part)) {
			s = s.replaceFirst(part, "");
		}

		return s;

	}

	public static void main(String[] args) {

		String s = "aabababa", part = "aba";

		System.out.println(removeOccurrences(s, part));

	}

}
