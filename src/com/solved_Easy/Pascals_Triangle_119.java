package com.solved_Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pascals_Triangle_119 {

	public static void main(String[] args) {

		System.out.println(getRow(50));
	}

	public static List<List<Integer>> getRow(int rowIndex) {

		List<List<Integer>> now = new ArrayList<>();
		Map<Integer, int[]> now1 = new HashMap<>();

		for (int i = 0; i <= rowIndex; i++) {
			if (i == 0) {
				int[] test = new int[i + 1];
				test[i] = 1;
				now1.put(i, test);
			} else if (i == 1) {
				int[] test = new int[i + 1];
				test[0] = 1;
				test[1] = 1;
				now1.put(i, test);
			} else {
				int[] test = new int[i + 1];
				test[0] = 1;
				test[test.length - 1] = 1;
				for (int j = 1; j <= test.length - 2; j++) {
					int[] k = now1.get(i - 1);
					test[j] = (k[j - 1] + k[j]);
				}
				now1.put(i, test);
			}
		}

		for (int i = 0; i <= rowIndex - 1; i++) {
			List<Integer> here = new ArrayList<>();
			int[] sam = now1.get(i);
			for (int j : sam)
				here.add(j);

			now.add(here);
		}

		return now;
	}

}
