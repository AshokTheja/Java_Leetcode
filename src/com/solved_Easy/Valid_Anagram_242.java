package com.solved_Easy;

public class Valid_Anagram_242 {

	public static boolean isAnagram(String s, String t) {

		boolean flag = false;
		
		if(s.length() != t.length()) {
			return false;
		}

		for (int i = 0; i <= s.length() - 1; i++) {

			System.out.println(s.substring(i, i + 1));

			if (t.contains(s.substring(i, i + 1))) {

				t = t.replaceFirst(s.substring(i, i + 1), "");

				flag = true;
			} else {
				flag = false;
				break;
			}

		}

		return flag;
	}

	public static void main(String[] args) {

		String s = "a", t = "ab";

		System.out.println(isAnagram(s, t));

	}

}
