package com.solved_Puzzles;

import java.util.LinkedHashMap;
import java.util.Map;

//Add two arrays and get[i] of each array as an separate array.
public class Add2Arrays_Get_I_ofEachArrayAsaSeparateArray {

	public static void main(String[] args) {

		int[] small = { 1, 2, 3, 4, 5 };
		int[] big = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] temp = new int[2];

		Map<Integer, Integer> lhm = new LinkedHashMap<>();

		int i = 0, j = 1;

		for (i = 0; i <= big.length - 1; i++) {
			if (i > small.length - 1) {
				lhm.put(big[i], j);
				j += 1;
			} else {
				lhm.put(big[i], small[i]);
			}

		}

		for (Map.Entry<Integer, Integer> entry : lhm.entrySet()) {
			temp[0] = entry.getKey();
			temp[1] = entry.getValue();
			System.out.println(temp[0] + "," + temp[1]);
		}

	}

}
