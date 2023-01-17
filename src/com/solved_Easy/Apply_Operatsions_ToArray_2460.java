package com.solved_Easy;

public class Apply_Operatsions_ToArray_2460 {

	public static void main(String[] args) {

		Apply_Operatsions_ToArray_2460 aot = new Apply_Operatsions_ToArray_2460();

		int nums[] = { 0, 1 };

		aot.applyOperations(nums);

	}

	public int[] applyOperations(int[] nums) {

		int j = 0;

		for (int i = 0; i <= nums.length - 2; i++) {

			if (nums[i] == nums[i + 1]) {
				nums[i] = nums[i] * 2;
				nums[i + 1] = 0;
			} else if (nums[i] == 0) {

			}

		}

		for (int i = 0; i <= nums.length - 1; i++) {

			if (nums[i] != 0) {
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				j++;
			}

		}

		for (int i : nums) {
			System.out.print(i + " ");
		}
		return nums;
	}

}
