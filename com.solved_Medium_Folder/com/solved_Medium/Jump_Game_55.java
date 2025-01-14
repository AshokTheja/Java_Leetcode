package com.solved_Medium;

public class Jump_Game_55 {

	public static void main(String[] args) {
		int[] nums = { 3, 2, 1, 0, 4 };
		System.out.println(canJump(nums));
	}

	public static boolean canJump(int[] nums) {
		boolean flag = false;

		if (nums.length == 1)
			return true;
		else if (nums[0] == 0)
			return false;

		Parent: for (int i = 0; i <= nums.length - 2; i++) {

			if (nums[i] == 0) {
				int temp = 2;
				for (int j = i - 1; j <= i; j--) {
					if (nums[j] >= temp++)
						continue Parent;
					else if (j == 0)
						return false;

				}
			}

			if ((nums[i] + i) >= nums.length - 1)
				return true;
			else
				continue;

		}

		return flag;
	}

}
