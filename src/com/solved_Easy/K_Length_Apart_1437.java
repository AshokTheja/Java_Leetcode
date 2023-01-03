package com.solved_Easy;

public class K_Length_Apart_1437 {

	public static void main(String[] args) {

		int[] test = { 0, 1, 0, 0, 1, 0, 0, 1 };
		int k = 2;

		boolean flag = kLengthApart(test, k);
		System.out.println(flag);

	}

	public static boolean kLengthApart(int[] nums, int k) {

		boolean flag = true;
		int l = 0;

		for (int i = 0; i <= nums.length - 1; i++) {
			int j = nums[0];
			if (j == nums[i]) {
				flag = true;
			} else if (nums[i] != j) {
				break;
			}
			if (i == nums.length - 1 && flag == true)
				return true;
		}

		Parent: for (int i = 0; i <= nums.length - 2; i++) {

			if (nums[i] == 0)
				continue;

			Child: for (int j = i + 1; j <= nums.length - 1; j++) {

				if (nums[i] != nums[j] && l == nums.length - 2) {
					return true;
				} else if (nums[i] != nums[j]) {
					l += 1;
					continue Child;
				} else if (l < k) {
					return false;
				} else if (nums[i] == nums[j] && l >= k) {
					i = j - 1;
					l = 0;
					continue Parent;
				}

			}
		}

		return flag;
	}

}
