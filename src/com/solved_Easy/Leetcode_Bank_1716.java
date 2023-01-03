package com.solved_Easy;

public class Leetcode_Bank_1716 {

	public static void main(String[] args) {

		int n = 4;
		System.out.println(totalMoney(n));
	}

	public static int totalMoney(int n) {

		int total = 0, j = 0;
		int use = 1;
		int[] test = new int[n];

		for (int i = 1; i <= n; i++) {

			if (total == 7) {
				use = use + 1;
				total = 0;
			}

			test[i - 1] = total + use;
			total += 1;

		}

		for (int i : test) {
			j += i;
		}

		return j;
	}

}
