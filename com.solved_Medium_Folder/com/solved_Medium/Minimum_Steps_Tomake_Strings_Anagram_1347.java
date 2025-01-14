package com.solved_Medium;

import java.util.HashMap;

public class Minimum_Steps_Tomake_Strings_Anagram_1347 {

	public static int minSteps(String s, String t) {

		int now = 0;

		HashMap<Character, Integer> ss = new HashMap<Character, Integer>();
		HashMap<Character, Integer> tt = new HashMap<Character, Integer>();

		for (int i = 0; i <= s.length() - 1; i++) {

			if (!ss.containsKey(s.charAt(i))) {
				ss.put(s.charAt(i), 1);
			} else {
				ss.put(s.charAt(i), ss.get(s.charAt(i)) + 1);
			}

			if (!tt.containsKey(t.charAt(i))) {
				tt.put(t.charAt(i), 1);
			} else {
				tt.put(t.charAt(i), tt.get(t.charAt(i)) + 1);
			}

		}

		for (char ch : ss.keySet()) {

			if (tt.containsKey(ch)) {

				if (ss.get(ch) > tt.get(ch)) {
					now += ss.get(ch) - tt.get(ch);
				}

			} else {

				now += ss.get(ch);
			}

		}

		return now;

	}

	public static void main(String[] args) {

		String s = "bab", t = "aba";

		System.out.println(minSteps(s, t));

	}

}
