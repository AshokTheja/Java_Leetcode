package com.solved_Easy;

public class Alternating_Digit_Sum_2544 {

	public static void main(String[] args) {

		Alternating_Digit_Sum_2544 ads = new Alternating_Digit_Sum_2544();

		int i = 886996;

		System.out.println(ads.alternateDigitSum(i));

	}

	public int alternateDigitSum(int n) {

		int sum = 0;

		String[] here = (Integer.toString(n)).split("");

		for (int i = 1; i <= here.length; i++) {

			if (i % 2 != 0) {
				sum += Integer.valueOf(here[i - 1]);
			} else {
				sum -= Integer.valueOf(here[i - 1]);
			}
		}

		return sum;

	}

}
