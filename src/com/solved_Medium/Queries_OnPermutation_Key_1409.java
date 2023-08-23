package com.solved_Medium;

import java.util.LinkedList;
import java.util.List;

public class Queries_OnPermutation_Key_1409 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static int[] processQueries(int[] queries, int m) {

		int[] here = new int[queries.length];

		List<Integer> req = new LinkedList();

		for (int i = 0; i <= m - 1; i++) {

			req.add(i + 1);

		}

		for (int j = 0; j <= queries.length - 1; j++) {

			here[j] = req.indexOf(queries[j]);

			int ret = req.get(here[j]);

			req.remove(here[j]);

			((LinkedList) req).addFirst(ret);

		}

		return here;

	}

	public static void main(String[] args) {

		int[] queries = { 7, 5, 5, 8, 3 };
		int m = 8;

		int[] ret = processQueries(queries, m);

		for (int i : ret) {
			System.out.println(i);
		}

	}

}
