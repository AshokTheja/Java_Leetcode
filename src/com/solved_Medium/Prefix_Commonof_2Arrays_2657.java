package com.solved_Medium;

import java.util.Arrays;

public class Prefix_Commonof_2Arrays_2657 {

	public static int[] findThePrefixCommonArray(int[] A, int[] B) {

		int[] here = new int[A.length];

		for (int i = 0; i <= A.length - 1; i++) {

			int[] AA = Arrays.copyOfRange(A, 0, i + 1);
			int[] BB = Arrays.copyOfRange(B, 0, i + 1);

			int now = 0;
			for (int j = 0; j <= AA.length - 1; j++) {

				for (int k = 0; k <= AA.length - 1; k++) {

					if (AA[j] == BB[k]) {
						now += 1;
					}

				}

			}

			here[i] = now;
		}

		return here;

	}

	public static void main(String[] args) {

		int[] A = { 2, 3, 1 }, B = { 3, 1, 2 };

		int[] here = findThePrefixCommonArray(A, B);

		for (int i : here)
			System.out.println(i);

	}

}
