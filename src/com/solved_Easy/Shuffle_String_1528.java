package com.solved_Easy;

public class Shuffle_String_1528 {

	public static void main(String[] args) {

		String s = "codeleet";
		int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };
		System.out.println(restoreString(s, indices));
	}

	public static String restoreString(String s, int[] indices) {

		char[] test = s.toCharArray();
		char[] test2 = new char[test.length];

		for (int i = 0; i <= test.length - 1; i++) {

			test2[indices[i]] = test[i];

		}

		String now = String.valueOf(test2);

		return now;

	}

}
