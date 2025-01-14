package com.solved_Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class First_Last_Positionin_SortedArray_34 {

	public static void main(String[] args) {
//		int[] nums = { 5, 7, 7, 8, 8, 10 }; // - working
//		int target = 8;
//		int[] nums = { 2, 2 }; // working
//		int target = 2;
//		int[] nums = { 1, 2, 3 }; // working
//		int target = 2;
//		int[] nums = { 5, 7, 7, 8, 8, 10 };  //- working
//		int target = 6;
//		int[] nums = { 1, 4 }; // - working
//		int target = 4;
//		int[] nums = { 3, 3, 3 }; // - working
//		int target = 3;
		int[] nums = { 1, 2, 3, 3, 3, 3, 4, 5, 9 }; // - working
		int target = 3;
		int[] theFinal = new int[2];
		theFinal = searchRange(nums, target);
		for (int i : theFinal)
			System.out.println(i);
	}

	public static int[] searchRange(int[] nums, int target) {

		int[] toReturn = new int[2];
		List<Integer> test = new ArrayList<>();
		for (int i = 0; i <= nums.length - 1; i++) {
			if (nums[i] == target)
				test.add(i);
		}

		if (test.size() == 1) {
			int now = test.get(0);
			test.add(now);
		} else if (test.size() == 0) {
			int to = -1;
			test.add(to);
			int now = test.get(0);
			test.add(now);
		} else if (test.size() > 2) {
			Collections.swap(test, 1, test.size() - 1);
		}

		for (int i = 0; i <= 1; i++) {
			toReturn[i] = test.get(i);
		}

		return toReturn;
	}
}
