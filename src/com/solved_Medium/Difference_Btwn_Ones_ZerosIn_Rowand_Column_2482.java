package com.solved_Medium;

public class Difference_Btwn_Ones_ZerosIn_Rowand_Column_2482 {

	public static int[][] onesMinusZeros(int[][] grid) {

		int[][] here = new int[grid.length][grid[0].length];

		for (int i = 0; i <= grid.length - 1; i++) {

			for (int j = 0; j <= grid[0].length - 1; j++) {

				int countInRowsOnes = countInRows(grid[i], 1);
				int countInRowsZeros = grid[i].length - countInRowsOnes;
				int countInColumnsOnes = countInColumns(grid, j, 1);
				int countInColumnsZeros = grid.length - countInColumnsOnes;

				here[i][j] = countInRowsOnes + countInColumnsOnes - countInRowsZeros - countInColumnsZeros;

			}

		}

		return here;

	}

	public static int countInRows(int[] here, int value) {

		int now = 0;

		for (int i : here) {
			if (i == value)
				now += 1;
		}

		return now;

	}

	public static int countInColumns(int[][] here, int column, int value) {

		int now = 0;

		for (int i = column; i == column; i++) {
			for (int k = 0; k <= here.length - 1; k++) {

				if (here[k][column] == value) {
					now += 1;
				}

			}
		}

		return now;

	}

	public static void main(String[] args) {

		int[][] grid = { { 0, 1, 1 }, { 1, 0, 1 }, { 0, 0, 1 } };

		int[][] now = onesMinusZeros(grid);

		for (int[] here : now) {

			for (int i : here) {
				System.out.println(i);
			}

		}

	}

}
