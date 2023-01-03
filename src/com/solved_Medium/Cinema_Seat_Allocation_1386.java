package com.solved_Medium;

import java.util.ArrayList;
import java.util.List;

public class Cinema_Seat_Allocation_1386 {

	public static void main(String[] args) {

		int n = 3;
		int[][] reservedSeats = { { 1, 2 }, { 1, 3 }, { 1, 8 }, { 2, 6 }, { 3, 1 }, { 3, 10 } };
		System.out.println(maxNumberOfFamilies(n, reservedSeats));
	}

	public static int maxNumberOfFamilies(int n, int[][] reservedSeats) {

		int count = 0, finalCount = 0;
		List<Integer> l1 = new ArrayList<>();

		Parent: for (int i = 0; i <= n - 1; i++) {
			int reservedCount = 0;
			boolean flag1 = true, flag2 = true, flag3 = true;
			for (int j = 0; j <= reservedSeats.length - 1; j++) {

				if (reservedSeats[j][0] == i + 1) {
					l1.add(reservedSeats[j][1]);
				} else if (j != reservedSeats.length - 1) {
					continue;
				}

				if (j == reservedSeats.length - 1) {
					for (int l = 2; l <= 5; l++) {
						if (l1.contains(l))
							flag1 = false;
					}

					for (int k = 4; k <= 7; k++) {
						if (l1.contains(k))
							flag2 = false;
					}

					for (int m = 6; m <= 9; m++) {
						if (l1.contains(m)) {
							flag3 = false;
						}
					}

					if (flag1 && flag2 && flag3)
						reservedCount += 2;
					else if (flag1 == false && flag2 == true && flag3 == false) {
						reservedCount += 1;
					} else if (flag1 == true && flag2 == false && flag3 == false) {
						reservedCount += 1;
					} else if (flag1 == false && flag2 == false && flag3 == true) {
						reservedCount += 1;
					} else if (flag1 == true && flag2 == true && flag3 == false) {
						reservedCount += 1;
					} else if (flag1 == false && flag2 == true && flag3 == true) {
						reservedCount += 1;
					}

					count = count + l1.size();
					if (count <= reservedSeats.length)
						finalCount = finalCount + reservedCount;

					if (i == n - 1)
						break Parent;

					l1.removeAll(l1);
				}
			}

		}

		return finalCount;
	}

}
