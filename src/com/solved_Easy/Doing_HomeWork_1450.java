package com.solved_Easy;

public class Doing_HomeWork_1450 {

	public static void main(String[] args) {

		int[] startTime = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int[] endTime = { 10, 10, 10, 10, 10, 10, 10, 10, 10 };
		int queryTime = 5;

		System.out.println(busyStudent(startTime, endTime, queryTime));
	}

	public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {

		int count = 0;

		for (int i = 0; i <= startTime.length - 1; i++) {

			for (int j = startTime[i]; j <= endTime[i]; j++) {

				if (j == queryTime)
					count += 1;
			}

		}

		return count;
	}
}
