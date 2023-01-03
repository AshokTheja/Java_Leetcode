package com.solved_Easy;

public class FlowerBeds_Easy_605 {

	public static void main(String[] args) {

		int[] flowerbed = { 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0,
				1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1,
				0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0 };
		int n = 17;
		System.out.println(canPlaceFlowers(flowerbed, n));
	}

	public static boolean canPlaceFlowers(int[] flowerbed, int n) {

		int test = 0;

		if (flowerbed.length > 3 && flowerbed.length < n + 2) {
			return false;
		}

		for (int i = 0; i <= flowerbed.length - 1; i++) {

			if (flowerbed.length == 1 && n == 1 && flowerbed[0] == 0)
				return true;
			else if (flowerbed.length == 1 && n == 0)
				return true;

			if (flowerbed[0] == 0 && flowerbed[1] == 0) {
				flowerbed[0] = 1;
				test += 1;
				continue;
			}

			if (test >= n)
				return true;

			if (i == flowerbed.length - 1 && flowerbed[i] != 1 && flowerbed[i - 1] == 1)
				return false;
			if (flowerbed[i] != 1 && i == flowerbed.length - 1 || flowerbed[i] != 1 && flowerbed[i + 1] != 1) {
				flowerbed[i] = 1;
				test += 1;
			}

			i = i + 1;
		}

		if (test >= n)
			return true;
		else
			return false;

	}

}
