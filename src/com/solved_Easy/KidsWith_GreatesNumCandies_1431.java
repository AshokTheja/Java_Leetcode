package com.solved_Easy;

import java.util.ArrayList;
import java.util.List;

public class KidsWith_GreatesNumCandies_1431 {

	@SuppressWarnings("unchecked")
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

		@SuppressWarnings("rawtypes")
		List<Boolean> al = new ArrayList();

		int greater = 0;

		for (int i = 0; i <= candies.length - 1; i++) {

			greater = candies[i] > greater ? candies[i] : greater;

		}

		for (int i = 0; i <= candies.length - 1; i++) {

			al.add(candies[i] + extraCandies >= greater ? true : false);

		}

		return al;

	}

	public static void main(String[] args) {

		int[] candies = new int[] { 12, 1, 12 };

		int extraCandies = 10;

		KidsWith_GreatesNumCandies_1431 kg = new KidsWith_GreatesNumCandies_1431();

		System.out.println(kg.kidsWithCandies(candies, extraCandies));

	}

}
