package com.solved_Puzzles;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class DuplicateinStringofWords_UsingMaps {

	public static void main(String[] args) {

		String test = "finding the duplicates in the string of words using the maps in java";
		test.toLowerCase();
		String[] test1 = test.split(" ");
		int count = 1;

		Map<String, Integer> test2 = new LinkedHashMap<>();
		Map<String, Integer> test3 = new HashMap<>();
		Map<String, Integer> test4 = new TreeMap<>();

		for (int i = 0; i <= test1.length - 1; i++) {

			if (test2.containsKey(test1[i])) {
				continue;
			}

			for (int j = i + 1; j <= test1.length - 1; j++) {

				if (i == test1.length - 1) {
					j = i;
				}

				if (test1[i].equals(test1[j])) {
					count += 1;
					test2.put(test1[i], count);
				}

			}
			if (count == 1) {
				test2.put(test1[i], count);
			} else {
				count = 1;
			}

		}
		test3.putAll(test2);
		test4.putAll(test2);
		System.out.println("Iam LinkedHashMap: " + test2);
		System.out.println("Iam HashMap: " + test3);
		System.out.println("Iam TreeMap: " + test4);
	}

}
