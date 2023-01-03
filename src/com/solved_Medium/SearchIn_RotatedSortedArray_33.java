package com.solved_Medium;

import java.util.ArrayList;
import java.util.List;

public class SearchIn_RotatedSortedArray_33 {

	public static void main(String[] args) {

		int[] nums = { 2, 5, 6, 0, 0, 1, 2 };
		int target = 0;
		System.out.println(search(nums, target));

	}

	public static boolean search(int[] nums, int target) {

		boolean flag = false;
		List<Integer> test = new ArrayList<>();

		for (int i = 0; i <= nums.length - 1; i++) {
			test.add(nums[i]);
		}

		if (test.contains(target))
			flag = true;
		else
			flag = false;

		return flag;
	}
}
