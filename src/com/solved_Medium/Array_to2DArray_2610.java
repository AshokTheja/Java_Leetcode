package com.solved_Medium;

import java.util.ArrayList;
import java.util.List;

public class Array_to2DArray_2610 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List<List<Integer>> findMatrix(int[] nums) {

		List<List<Integer>> here = new ArrayList();
		List<Integer> test = new ArrayList();

		here.add(test);

		for (int i = 0; i <= nums.length - 1; i++) {

			child: for (int j = 0; j <= here.size() - 1; j++) {

				if (!here.get(j).contains(nums[i])) {

					here.get(j).add(nums[i]);
					break child;

				} else if (here.get(j).contains(nums[i]) && j < here.size() - 1) {
					continue;
				} else {
					List<Integer> now = new ArrayList();
					here.add(now);
				}

			}

		}
		;

		return here;

	}

	public static void main(String[] args) {

		int[] nums = { 1, 3, 4, 1, 2, 3, 1 };

		System.out.println(findMatrix(nums));

	}

}
