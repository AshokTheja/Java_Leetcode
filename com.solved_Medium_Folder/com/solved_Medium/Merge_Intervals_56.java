package com.solved_Medium;

import java.util.HashMap;

public class Merge_Intervals_56 {

	public static void main(String[] args) {

		int[][] here = { { 1, 4 }, { 0, 0 } };

		int[][] here1 = merge(here);

		for (int i = 0; i <= here1.length - 1; i++) {
			System.out.println(here1[i]);
		}

	}

	public static int[][] merge(int[][] intervals) {

		if (intervals.length == 1)
			return intervals;

		boolean flag = false;
		int[] temp = { 0, 0 };

		HashMap<Integer, Integer> ex = new HashMap<>();

		for (int i = 0; i <= intervals.length - 2; i++) {

			int[] one = intervals[i];

			int[] two = intervals[i + 1];

			if (two[0] == 0 && two[1] == 0) {
				int temp1[] = new int[2];
				temp1 = one;
				one = two;
				two = temp1;
				int temp2[] = new int[2];
				temp2 = intervals[i];
				intervals[i] = intervals[i + 1];
				intervals[i + 1] = temp2;
				ex.put(0, 0);
				// flag = true;
			}

			if (two[0] <= one[1] && two[1] >= one[1]) {
				temp[0] = one[0];
				temp[1] = two[1];
				flag = true;
			}
			if (flag == true && two[0] < one[0]) {
				temp[0] = two[0];
				flag = true;
			}

			if (two[0] < one[0] && two[1] < one[1]) {
				temp[0] = two[0];
				temp[1] = one[1];
				flag = true;
			}

			if (two[0] > one[0] && two[1] < one[1]) {
				temp[0] = one[0];
				temp[1] = one[1];
				flag = true;
			}

			if (flag == true) {
				intervals[i + 1] = temp;
				ex.put(temp[0], temp[1]);
				flag = false;
				continue;
			} else {
				ex.put(one[0], one[1]);
			}

			if (i == intervals.length - 2 && flag == false) {
				ex.put(two[0], two[1]);
			}
		}

		int[][] test = new int[ex.size()][2];

		Object[] my1 = ex.keySet().toArray();
		Object[] my2 = ex.values().toArray();

		for (int i = 0; i <= test.length - 1; i++) {
			test[i][0] = (int) my1[i];
			test[i][1] = (int) my2[i];
		}

		return test;
	}
}
