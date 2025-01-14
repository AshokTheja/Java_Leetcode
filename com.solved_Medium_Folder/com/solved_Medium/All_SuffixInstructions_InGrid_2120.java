package com.solved_Medium;

import java.util.Arrays;

public class All_SuffixInstructions_InGrid_2120 {

	public static int[] executeInstructions(int n, int[] startPos, String s) {

		int[] here = new int[s.length()];
		int[] copyPos = Arrays.copyOf(startPos, startPos.length);

		int fresh = 0;
		int arrInsert = 0;

		for (int i = 0; i <= s.length() - 1; i++) {

			boolean flag = true;

			if (s.charAt(i) == 'L') {
				startPos[1] = startPos[1] - 1;
				fresh += 1;
			} else if (s.charAt(i) == 'R') {
				startPos[1] = startPos[1] + 1;
				fresh += 1;
			} else if (s.charAt(i) == 'U') {
				startPos[0] = startPos[0] - 1;
				fresh += 1;
			} else if (s.charAt(i) == 'D') {
				startPos[0] = startPos[0] + 1;
				fresh += 1;
			}

			if (startPos[0] < 0) {
				fresh -= 1;
				flag = false;
			} else if (startPos[0] >= n) {
				fresh -= 1;
				flag = false;
			} else if (startPos[1] < 0) {
				fresh -= 1;
				flag = false;
			} else if (startPos[1] >= n) {
				fresh -= 1;
				flag = false;
			}

			if ((flag == true) && (i == s.length() - 1)) {
				here[arrInsert] = fresh;
				arrInsert += 1;
				s = s.substring(1, s.length());
				fresh = 0;
				startPos = Arrays.copyOf(copyPos, copyPos.length);
				i = -1;
				continue;
			} else if (flag == false) {
				here[arrInsert] = fresh;
				arrInsert += 1;
				s = s.substring(1, s.length());
				fresh = 0;
				startPos = Arrays.copyOf(copyPos, copyPos.length);
				i = -1;
				continue;
			}

		}

		return here;

	}

	public static void main(String[] args) {

		int n = 1;
		int[] startPos = { 0, 0 };
		String s = "LRUD";

		int[] retArray = executeInstructions(n, startPos, s);

		for (int i : retArray) {
			System.out.println(i);
		}
	}

}
