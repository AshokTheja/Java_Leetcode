package com.solved_Medium;

//import java.util.HashMap;
//import java.util.Map;

public class Prison_Cells_957 {

	public static void main(String[] args) {
		int[] cells = { 1, 0, 0, 1, 0, 0, 1, 0 };
		int N = 1000000000;

		int[] finalCells = prisonAfterNDays(cells, N);

		for (int i : finalCells)
			System.out.println(i);
	}

	public static int[] prisonAfterNDays(int[] cells, int N) {

		int[] currentStatus = new int[cells.length];

		currentStatus[0] = 0;
		currentStatus[cells.length - 1] = 0;
//		Map<Integer, int[]> test = new HashMap<>();
//		test.put(0, cells);

		// Using Hash Map
//		for (int i = 0; i <= N - 1; i++) {
//
//			for (int j = 1; j <= test.get(i).length - 2; j++)
//
//				currentStatus[j] = test.get(i)[j - 1] == test.get(i)[j + 1] ? 1 : 0;
//
//			test.put(i + 1, currentStatus.clone());
//		}
//
//		return test.get(test.size() - 1);

		N %= 14;

		for (int i = 0; i <= N - 1; i++) {
			if (i >= 1)
				cells = currentStatus.clone();

			for (int j = 1; j <= cells.length - 2; j++)
				currentStatus[j] = cells[j - 1] == cells[j + 1] ? 1 : 0;
		}

		return currentStatus;
	}
}
