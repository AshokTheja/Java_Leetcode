package com.solved_Medium;

import java.util.ArrayList;
import java.util.List;

public class Group_The_People_1282 {

	@SuppressWarnings("rawtypes")
	public List<List<Integer>> groupThePeople(int[] groupSizes) {

		@SuppressWarnings("unchecked")
		List<List<Integer>> test = new ArrayList();

		for (int i = 0; i <= groupSizes.length - 1; i++) {

			if (groupSizes[i] > 0) {

				test.add(testOne(groupSizes, groupSizes[i]));

			}

		}

		return test;

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List<Integer> testOne(int[] groupSizes, int here1) {

		List<Integer> here = new ArrayList();

		for (int i = 0; i <= here1 - 1; i++) {

			int why = 0;

			for (int j = why; j <= groupSizes.length - 1; j++) {

				if (groupSizes[j] == here1) {

					here.add(j);
					groupSizes[j] = 0;
					why = j;
					break;
				}

			}

		}

		return here;

	}

	public static void main(String[] args) {

		Group_The_People_1282 gtp = new Group_The_People_1282();

		int[] here = { 2, 1, 3, 3, 3, 2 };

		System.out.println(gtp.groupThePeople(here));

	}

}
