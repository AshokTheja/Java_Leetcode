package com.solved_Medium;

public class Rev_WordsinString_151 {

	public static void main(String[] args) {

		String s = "Alice does not even like bob";
		System.out.println(reverseWords(s));
	}

	public static String reverseWords(String s) {

		String reConstructed;
		String[] s1 = s.split(" ");
		StringBuilder sb = new StringBuilder();

		for (int i = s1.length - 1; i >= 0; i--) {
			if (s1[i].length() == 0)
				continue;
			else
				sb.append(s1[i].trim() + " ");
		}

		reConstructed = sb.toString();
		reConstructed = reConstructed.trim();

		return reConstructed;

	}
}
