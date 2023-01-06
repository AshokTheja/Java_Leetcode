package com.solved_Medium;

public class Minimum_Arrow_Shoots_452 {

	public int findMinArrowShots(int[][] points) {

		int start = 0;

		for (int i = 0; i <= points.length - 1; i++) {

			int iFirst = points[i][0];
			int iSecond = points[i][1];

			for (int j = i + 1; j <= points.length - 1; j++) {

				int jFirst = points[j][0];
				int jSecond = points[j][1];

				if ((jFirst >= iFirst && jFirst <= iSecond) || (jSecond <= iSecond && jSecond >= iFirst)) {

					points[j][0] = 0;
					points[j][1] = 0;

				} else {
					continue;
				}

			}

		}

		for (int[] here : points) {
			if (here[0] == 0 && here[1] == 0) {
				continue;
			} else {
				start += 1;
			}
		}

		return start;

	}

	public static void main(String[] args) {
		Minimum_Arrow_Shoots_452 mas = new Minimum_Arrow_Shoots_452();

		int[][] here = { { 3, 9 }, { 7, 12 }, { 3, 8 }, { 6, 8 }, { 9, 10 }, { 2, 9 }, { 0, 9 }, { 3, 9 }, { 0, 6 },
				{ 2, 8 } };
		System.out.println(mas.findMinArrowShots(here));
	}

}
