package com.solved_Medium;

public class House_robber_198 {

	public static void main(String[] args) {

		House_robber_198 hr = new House_robber_198();

		int[] nums = { 1, 1, 1, 2 };

		System.out.println(hr.rob(nums));

	}

	public int rob(int[] nums) {

		int zeroSum = 0, firstSum = 0;

		for (int i = 0; i <= nums.length - 1; i++) {

			if (i == 0) {
				zeroSum += nums[i];
				i++;
				continue;
			} else if (i != 0 && (i != nums.length - 1 || i != nums.length - 2) && nums[i] < nums[i + 1]
					&& nums[i + 1] < nums[i + 2]) {
				i += 1;
				zeroSum += nums[i];
				i++;
				continue;
			} else if (i <= nums.length - 1) {
				zeroSum += nums[i];
				i++;
			}

		}

		System.out.println("zeroSum: " + zeroSum);

		for (int j = 1; j <= nums.length - 1; j++) {

			if (j == 1) {
				firstSum += nums[j];
				j++;
				continue;
			} else if (j != 1 && (j != nums.length - 1 || j != nums.length - 2) && nums[j] < nums[j + 1]
					&& nums[j + 1] < nums[j + 2]) {
				j += 1;
				firstSum += nums[j];
				j++;
				continue;
			} else if (j <= nums.length - 1) {
				firstSum += nums[j];
				j++;
			}

		}

		System.out.println("firstSUM: " + firstSum);

		return firstSum > zeroSum ? firstSum : zeroSum;

	}

}
