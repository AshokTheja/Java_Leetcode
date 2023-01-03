package com.solved_Puzzles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Biggest_Num_FromArray {

	public static void main(String[] args) {

		int[] test = { -46, -5, 6, 12, 0, 55 };
		int biggest = 0;

		// By sorting and returning last integer
		List<Integer> l1 = new ArrayList<>();

		for (int i : test)
			l1.add(i);

		Collections.sort(l1);
		System.out.println("Biggest number in the given array: " + l1.get(l1.size() - 1));

		// 2 method

		// Converting negative integers to 0;
		for (int j = 0; j <= test.length - 1; j++) {
			if (test[j] < 0)
				test[j] = 0;
		}

		for (int j : test)
			if (j > biggest)
				biggest = j;

		System.out.println("Biggest from 2nd method: " + biggest);

	}

}
