package com.solved_Puzzles;

public class SecondSmallesNumberinanArray_withoutSort {

	// Find the Second smallest number in an array with out using Sort.

	public static void main(String[] args) {

		int[] test = { 11, 2, 1, 9, 44, 5 };

		int temp = 0;

		for (int i = 0; i < test.length; i++) {

			for (int j = i + 1; j < test.length; j++) {

				if (test[i] > test[j]) {

					temp = test[i];
					test[i] = test[j];
					test[j] = temp;
				}
			}

		}

		System.out.println(test[1]);

	}

}
