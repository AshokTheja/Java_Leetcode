package com.solved_Medium;

import java.util.HashSet;
import java.util.Set;

public class Distinct_Integer_AfterReverse_2442 {

	public static void main(String[] args) {

		Distinct_Integer_AfterReverse_2442 dia = new Distinct_Integer_AfterReverse_2442();

		int[] here = { 2, 2, 2 };

		System.out.println(dia.countDistinctIntegers(here));
	}

	public int countDistinctIntegers(int[] nums) {

		Set<Integer> set = new HashSet<>();

		for (Integer here : nums) {

			int i = Integer.parseInt(new StringBuilder(here.toString()).reverse().toString());

			set.add(here);

			set.add(i);

		}

		return set.size();

	}

}
