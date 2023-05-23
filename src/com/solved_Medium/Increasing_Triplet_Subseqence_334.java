package com.solved_Medium;

public class Increasing_Triplet_Subseqence_334 {

	public static boolean increasingTriplet(int[] nums) {

		int smaller = nums[0];

		for (int i = 1; i <= nums.length - 1; i++) {

			int greater = 0;
			if (smaller > nums[i]) {
				smaller = nums[i];

				continue;
			}

			if (smaller == nums[i])
				continue;

			for (int j = nums.length - 1; j >= i + 1; j--) {

				if (greater < nums[j])
					greater = nums[j];
			}

			for (int j = i + 1; j <= nums.length - 1; j++) {
				if (smaller < nums[i] && nums[i] < greater) {
					return true;
				}
			}

		}

		return false;
	}

	public static void main(String[] args) {

		int[] here = { 0, 4, 2, 1, 0, -1, -3 };

		System.out.println(increasingTriplet(here));

	}

}
