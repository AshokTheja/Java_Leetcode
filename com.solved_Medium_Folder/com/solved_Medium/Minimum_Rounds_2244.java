package com.solved_Medium;

import java.util.HashMap;
import java.util.Map;

public class Minimum_Rounds_2244 {

	public static void main(String[] args) {

		Minimum_Rounds_2244 mr = new Minimum_Rounds_2244();

		int[] now = { 2, 3, 3 };
		System.out.println(mr.minimumRounds(now));

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public int minimumRounds(int[] tasks) {

		int fHere = 0;

		Map<Integer, Integer> hm = new HashMap();

		for (int i = 0; i <= tasks.length - 1; i++) {

			if (!hm.containsKey(tasks[i])) {
				hm.put(tasks[i], 1);
			} else {
				hm.put(tasks[i], hm.get(tasks[i]) + 1);
			}

		}

		for (int j : hm.values()) {

			int div = j / 3;
			int rem = j % 3;

			if (j == 1) {
				return -1;
			} else if ((div >= 1) && (rem == 0)) {
				fHere += div;
			} else if (div == 0 && rem > 0) {
				fHere += 1;
			} else if (div >= 1 && rem > 0) {
				fHere = fHere + div + 1;
			}

		}

		return fHere;

	}

}
