package com.solved_Easy;

public class Two_Sum_1 {

	public static void main(String[] args) {

		int[] nums = { 3, 3 };
		int[] got = twoSum(nums, 6);

		for (int i = 0; i <= got.length - 1; i++) {
			System.out.println(got[i]);
		}

	}

	public static int[] twoSum(int[] nums, int target) {

		int[] test = new int[2];

		Parent: for (int i = 0; i <= nums.length - 2; i++) {

			for (int j = i + 1; j <= nums.length - 1; j++) {

				if (nums[i] + nums[j] == target) {
					test[0] = i;
					test[1] = j;
					break Parent;
				}
			}
		}

		return test;

	}

}
