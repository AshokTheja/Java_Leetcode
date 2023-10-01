package com.solved_Easy;

public class ArrayFrom_Permutation_1920 {

	public static int[] buildArray(int[] nums) {

		int[] now = new int[nums.length];

		for (int i = 0; i <= nums.length - 1; i++) {
			now[i] = nums[nums[i]];
		}

		return now;

	}

	public static void main(String[] args) {

		int[] nums = { 5, 0, 1, 2, 3, 4 };

		int[] ret = buildArray(nums);

		for (int i : ret)
			System.out.println(i);

	}

}
