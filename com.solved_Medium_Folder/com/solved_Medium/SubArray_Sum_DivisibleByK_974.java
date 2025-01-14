package com.solved_Medium;

public class SubArray_Sum_DivisibleByK_974 {

	public static void main(String[] args) {

		SubArray_Sum_DivisibleByK_974 ssd = new SubArray_Sum_DivisibleByK_974();

		int[] nums = { 4, 5, 0, -2, -3, 1 };

		System.out.println(ssd.subarraysDivByK(nums, 5));

	}

	public int subarraysDivByK(int[] nums, int k) {

		int count = 0;

		for (int i1 = 0; i1 <= nums.length - 1; i1++) {

			int now = nums[i1];
			if (nums[i1] % k == 0) {

				count++;

			}

			for (int i2 = i1 + 1; i2 <= nums.length - 1; i2++) {

				if ((now += nums[i2]) % k == 0) {
					count++;

				}

			}
		}

		return count;
	}

}
