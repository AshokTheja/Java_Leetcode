package com.solved_Easy;

public class Discount_Price_1475 {

	public static void main(String[] args) {

		int[] prices = { 10, 1, 1, 6 };
		int[] finalPrices = finalPrices(prices);

		for (int i : finalPrices)
			System.out.println(i);

	}

	public static int[] finalPrices(int[] prices) {

		int[] test = new int[prices.length];

		for (int i = 0; i <= prices.length - 1; i++) {

			if (i == prices.length - 1)
				test[i] = prices[i];

			Child: for (int j = i + 1; j <= prices.length - 1; j++) {
				if (prices[j] <= prices[i]) {
					test[i] = prices[i] - prices[j];
					break Child;
				} else if (j == prices.length - 1) {
					test[i] = prices[i];
				}
			}
		}

		return test;
	}

}
