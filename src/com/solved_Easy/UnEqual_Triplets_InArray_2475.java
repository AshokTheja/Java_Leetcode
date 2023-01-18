package com.solved_Easy;

public class UnEqual_Triplets_InArray_2475 {

	public static void main(String[] args) {

		UnEqual_Triplets_InArray_2475 uti = new UnEqual_Triplets_InArray_2475();

		int[] nums = { 1, 1, 1, 1, 1 };

		System.out.println(uti.unequalTriplets(nums));

	}

	public int unequalTriplets(int[] nums) {

		int i1 = 0;

		for (int i = 0; i <= nums.length - 3; i++) {

			for (int j = 0; j <= nums.length - 2; j++) {

				for (int k = 0; k <= nums.length - 1; k++) {

					if ((i < j) && (j < k) && nums[i] != nums[j] && nums[i] != nums[k] && nums[j] != nums[k]) {

						i1 += 1;
					}

				}
			}

		}

		return i1;
	}

}
