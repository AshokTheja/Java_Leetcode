package com.solved_Medium;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFrom_SortedArray_80 {
	// Given a sorted array nums, remove the duplicates in-place such that
	// duplicates appeared at most twice and return the new length.
	public static void main(String[] args) {

		int[] nums = { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
		System.out.println(removeDuplicates(nums));

	}

	public static int removeDuplicates(int[] nums) {

		int count = 0, temp, length = 0;
		List<Integer> test = new ArrayList<>();
		List<Integer> test1 = new ArrayList<>();

		if (nums.length == 0 || nums.length == 1) {
			return nums.length;
		} else {
			for (int i : nums)
				test.add(i);
		}

		temp = test.get(0);
		for (int i = 0; i <= test.size() - 1; i++) {
			if (test.get(i) == temp) {
				count++;
				if (count <= 2)
					test1.add(test.get(i));
			} else if (test.get(i) != temp) {
				temp = test.get(i);
				count = 0;
				i--;
			}
		}

		length = test1.size();

		for (int i = 0; i <= test1.size() - 1; i++) {
			nums[i] = test1.get(i);
		}

		return length;
	}

}
