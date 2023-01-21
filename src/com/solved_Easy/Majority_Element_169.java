package com.solved_Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Majority_Element_169 {

	public static void main(String[] args) {

		Majority_Element_169 me = new Majority_Element_169();

		int[] here = { 1 };

		System.out.println(me.majorityElement(here));

	}

	public int majorityElement(int[] nums) {

		int i1 = 0;

		if (nums.length == 1) {
			return nums[0];
		} else {
			i1 = nums.length / 2;
		}

		Map<Integer, Integer> now = new HashMap<>();
		Arrays.sort(nums);

		for (int i = 0; i <= nums.length - 1; i++) {

			if (now.containsKey(nums[i])) {

				int i3 = now.get(nums[i]) + 1;

				if (i3 > i1) {
					return nums[i];
				} else {
					now.put(nums[i], i3);
				}
			} else {
				now.put(nums[i], 1);
			}

		}

		return 0;

	}

}
