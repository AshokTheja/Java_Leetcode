package com.solved_Easy;

public class Jewels_Stones_771 {

	public static void main(String[] args) {
		String jewels = "z", stones = "ZZ";
		System.out.println(numJewelsInStones(jewels, stones));
	}

	public static int numJewelsInStones(String jewels, String stones) {

		int total = 0;

		for (int i = 0; i <= jewels.length() - 1; i++) {
			for (int j = 0; j <= stones.length() - 1; j++) {
				if (jewels.charAt(i) == stones.charAt(j))
					total += 1;
			}
		}

		return total;
	}

}
