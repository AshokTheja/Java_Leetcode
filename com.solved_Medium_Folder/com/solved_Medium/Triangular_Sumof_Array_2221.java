package com.solved_Medium;

import java.util.Arrays;

public class Triangular_Sumof_Array_2221 {

	public static int triangularSum(int[] nums) {

		int here = 0;

		for (int i = 0; i <= nums.length - 2; i++) {

			nums[i] = (nums[i] + nums[i + 1]) % 10;

			if (i == nums.length - 2) {

				nums = Arrays.copyOfRange(nums, 0, nums.length - 1);

				i = -1;
			}

		}

		if (nums.length == 1) {
			here = nums[0];

		}

		return here;

	}

	public static void main(String[] args) {

		int[] nums = { 5 };

		System.out.println(triangularSum(nums));
	}

}
