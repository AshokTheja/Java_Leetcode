package com.solved_Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Distinct_Averages_2465 {

	public static void main(String[] args) {

		Distinct_Averages_2465 da = new Distinct_Averages_2465();

		int[] here = { 9, 5, 7, 8, 7, 9, 8, 2, 0, 7 };

		System.out.println(da.distinctAverages(here));

	}

	public int distinctAverages(int[] nums) {

		Arrays.sort(nums);

		int ends = nums.length - 1;

		Set<Double> here = new HashSet<>();

		for (int i = 1; i <= (nums.length) / 2; i++) {

			here.add(Double.valueOf(nums[i - 1] + nums[ends]) / 2);

			ends -= 1;

		}

		return here.size();
	}

}
