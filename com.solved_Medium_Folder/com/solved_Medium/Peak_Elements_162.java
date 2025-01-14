package com.solved_Medium;

public class Peak_Elements_162 {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4 };
		System.out.println(findPeakElement(nums));

	}

	public static int findPeakElement(int[] nums) {

		int req = 0;
		for (int i = 1; i < nums.length; i++) {

			if (nums.length <= 2) {
				if (nums[i] > nums[i - 1])
					return i;
				else
					return i - 1;
			} else if ((nums[i] > nums[i - 1]) && (nums[i] > nums[i + 1]) && (i <= nums.length - 2))
				return i;
			else if (i == nums.length - 2) {
				if (nums[i + 1] > nums[i])
					return i + 1;

			}

		}

		return req;
	}

}
