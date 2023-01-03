package com.solved_Puzzles;

public class Sort_Array_Amaze {

	public static void main(String[] args) {

		int[] test = { 0, 1, 0, 0, 1, 1, 1 };
		int temp = 0;

		for (int i = 0; i <= test.length - 2; i++) {

			if (test[i] > test[i + 1]) {
				temp = test[i];
				test[i] = test[i + 1];
				test[i + 1] = temp;
			}
			
		}
		for (int i : test)
			System.out.println(i);
	}

}
