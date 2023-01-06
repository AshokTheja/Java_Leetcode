package com.solved_Medium;

import java.util.Arrays;

public class Max_IcreCream_Bars_1833 {

	public static int maxIceCream(int[] costs, int coins) {

		int maxi = 0;
		int touch = 0;
		Arrays.sort(costs);
		for (int i : costs) {
			if (maxi + i <= coins) {
				maxi += i;
				touch += 1;
			}
		}

		return touch;

	}

	public static void main(String[] args) {

		int[] costs = { 1, 6, 3, 1, 2, 5 };
		System.out.println(maxIceCream(costs, 20));

	}
}
