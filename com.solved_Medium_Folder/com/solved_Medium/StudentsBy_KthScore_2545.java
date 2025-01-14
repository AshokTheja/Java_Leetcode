package com.solved_Medium;

public class StudentsBy_KthScore_2545 {

	public static int[][] sortTheStudents(int[][] score, int k) {

		for (int i = 0; i <= score.length - 2; i++) {

			for (int j = i + 1; j <= score.length - 1; j++) {

				if (score[j][k] > score[i][k]) {

					int[] here = score[i];
					score[i] = score[j];
					score[j] = here;

				}

			}
		}

		return score;

	}

	public static void main(String[] args) {

		int k = 0;

		int[][] score = { { 3, 4 }, { 5, 6 } };

		System.out.println(sortTheStudents(score, k));

	}

}
