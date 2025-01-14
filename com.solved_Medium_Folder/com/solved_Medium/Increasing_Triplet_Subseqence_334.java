package com.solved_Medium;

import java.util.Arrays;

public class Increasing_Triplet_Subseqence_334 {

	public static boolean increasingTriplet(int[] nums) {

		int smaller = nums[0];
		int cycle = 0;

		for (int i = 1; i <= nums.length - 2; i++) {

			System.out.println(i);

			if (nums[i] < smaller) {
				smaller = nums[i];

				continue;

			} else if (nums[i] == smaller) {
				continue;
			} else if (nums[i] > smaller && nums[i] < findGreater(Arrays.copyOfRange(nums, (i + 1), (nums.length)))) {

				return true;
			} else if (((findGreater(Arrays.copyOfRange(nums, (i + 1), (nums.length))) - smaller == 1))) {

				cycle += 1;

				if (cycle > 2)
					break;

			} else if ((findGreater(Arrays.copyOfRange(nums, (i + 1), (nums.length))) - smaller == 0)) {
				cycle += 1;

				break;
			}

		}

		return false;
	}

	public static int findGreater(int[] now) {

		return Arrays.stream(now).max().getAsInt();

	}

	public static void main(String[] args) {

		int[] here = { 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2,
				1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1,
				2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2,
				1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1,
				2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2,
				1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1,
				2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2,
				1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1,
				2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2,
				1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2 };

		System.out.println(increasingTriplet(here));

	}

}
