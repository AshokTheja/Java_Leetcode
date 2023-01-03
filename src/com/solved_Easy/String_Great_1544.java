package com.solved_Easy;

public class String_Great_1544 {

	public static void main(String[] args) {

		String s = "s";
		System.out.println(makeGood(s));

	}

	public static String makeGood(String s) {

		for (int i = 0; i <= s.length() - 2; i++) {

			if (s.charAt(i) != s.charAt(i + 1)) {

				char c = s.charAt(i);

				if (Character.isLowerCase(c))
					c = Character.toUpperCase(c);
				else
					c = Character.toLowerCase(c);

				if (c != s.charAt(i + 1)) {
					continue;
				} else {
					s = s.substring(0, i) + s.substring(i + 2);
					i = -1;
				}

			}

		}

		return s;
	}
}