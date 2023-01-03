package com.solved_Puzzles;

public class ReverseStringofWords {

	public static void main(String[] args) {

		String actual = "Reverse, a. String of words demo.";

		String[] actualList = actual.split(" ");
		String reversed = "";

		for (String i : actualList) {
			char[] j = i.toCharArray();
			int k = j.length;
			String temp, temp1 = "", temp2 = " ";

			if (!Character.isAlphabetic(j[k - 1])) {
				temp = i.substring(0, j.length - 1);
				temp1 = i.substring(j.length - 1, j.length);
			} else {
				temp = i;
			}

			for (int l = temp.length() - 1; l >= 0; l--) {
				reversed = reversed + temp.charAt(l);
			}
			reversed = reversed + temp1 + temp2;
		}
		System.out.println(reversed);
	}
}
