package com.solved_Medium;

public class SearchInRotatedSortedArray_81 {

	public static void main(String[] args) {

		int[] test = { 1 };
		int target = 1;
		System.out.println(search(test, target));
	}

	public static int search(int[] nums, int target) {

		int toReturn = -1;
		for (int i = 0; i <= nums.length - 1; i++) {
			if (nums[i] == target)
				toReturn = i;
		}

		return toReturn;

	}
}
