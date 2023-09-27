package com.solved_Medium;

import java.util.Arrays;

public class Maximum_Coins_UGet_1561 {

	public static int maxCoins(int[] piles) {

		int num = 0;

		Arrays.sort(piles);

		piles = Arrays.copyOfRange(piles, (piles.length / 3), piles.length);

		for (int i = 0; i <= piles.length - 1; i++) {

			num += piles[i];

			i++;

		}

		return num;

	}

	public static void main(String[] args) {

		int[] piles = { 9, 8, 7, 6, 5, 1, 2, 3, 4 };

		System.out.println(maxCoins(piles));

	}

}
