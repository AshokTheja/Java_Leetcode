package com.solved_Medium;

import java.util.ArrayList;
import java.util.List;

public class Non_Decreasing_Subsequences_491 {

	public static void main(String[] args) {

		Non_Decreasing_Subsequences_491 nds = new Non_Decreasing_Subsequences_491();

		int[] here = { 4,4,3,2,1 };

		System.out.println(nds.findSubsequences(here));

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<List<Integer>> findSubsequences(int[] nums) {

		List<List<Integer>> here = new ArrayList<>();

		for (int i1 = 0; i1 <= nums.length - 2; i1++) {

			int help = i1 + 1;

			List<Integer> here1 = new ArrayList();

			here1.add(nums[i1]);

			for (int i2 = i1 + 1; i2 <= nums.length - 1; i2++) {

				List<Integer> here2 = new ArrayList();

				if (nums[i1] <= nums[i2]) {

					here1.add(nums[i2]);

					here2.addAll(here1);

					if (!here.contains(here2)) {
						here.add(here2);
					}

				}

				if (help != nums.length - 1 && i2 == nums.length - 1) {
					i2 = help;
					help++;
					here1.clear();
					here1.add(nums[i1]);
				}

			}

		}

		return here;

	}

}
