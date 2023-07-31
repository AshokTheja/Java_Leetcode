package com.solved_Easy;

public class Get_Concetnation_1929 {

	public static int[] getConcatenation(int[] nums) {

		int now = 0;

		int[] here = new int[nums.length * 2];

		for (int i = 0; i <= 1; i++) {

			for (int j = 0; j <= nums.length - 1; j++) {

				here[now] = nums[j];
				now += 1;

			}

		}


		for(int i : here) {
			System.out.println(i);
		}
		return here;

	}

	public static void main(String[] args) {

		int[] nums = { 1, 2, 1 };

		System.out.println(getConcatenation(nums));

	}

}
