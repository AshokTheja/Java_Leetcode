package com.solved_Medium;

import java.util.ArrayList;
import java.util.List;

public class Partition_Array_2161 {

	@SuppressWarnings("rawtypes")
	public static int[] pivotArray(int[] nums, int pivot) {

		@SuppressWarnings("unchecked")
		List<Integer> lets = new ArrayList();
		int here1[] = new int[nums.length];
		for (int i = 0; i <= nums.length - 1; i++) {

			if (nums[i] < pivot) {
				lets.add(nums[i]);
			}

		}

		for (int i = 0; i <= nums.length - 1; i++) {

			if (nums[i] == pivot) {
				lets.add(nums[i]);
			}

		}

		for (int i = 0; i <= nums.length - 1; i++) {

			if (nums[i] > pivot) {
				lets.add(nums[i]);
			}

		}

		for (int i = 0; i <= nums.length - 1; i++) {
			here1[i] = lets.get(i);
		}
		;

		return here1;

	}

	public static void main(String[] args) {

		int pivot = 10;
		int[] nums = { 9, 12, 5, 10, 14, 3, 10 };

		int[] ret = pivotArray(nums, pivot);

		for (int num : ret) {
			System.out.println(num);
		}
	}

}
