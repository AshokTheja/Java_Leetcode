package com.solved_Medium;

public class Rearrange_Elements_BySign_2149 {

	public static int[] rearrangeArray(int[] nums) {

		int[] here = new int[nums.length];

		int positiveNums = 0;
		int negativeNums = 1;

		for (int i = 0; i <= nums.length - 1; i++) {

			if (nums[i] > 0) {
				here[positiveNums] = nums[i];
				positiveNums += 2;
			} else if (nums[i] < 0) {
				here[negativeNums] = nums[i];
				negativeNums += 2;
			}

		}

		return here;

	}

	public static void main(String[] args) {

		int[] nums = { -1, 1 };

		int[] here = rearrangeArray(nums);

		for (int i : here) {

			System.out.println(i);
		}

	}

}
