package com.solved_Puzzles;

public class Commons_in_Arrays_Amaze {

	public static void main(String[] args) {

		int arr1[] = { 1, 4, 25, 55, 78, 99 };
		int arr2[] = { 2, 3, 4, 34, 55, 68, 75, 78, 100 };
		int arr3[] = { 4, 55, 62, 78, 88, 98 };

		for (int i : arr1)
			System.out.println(i);

		for (int i : arr2)
			System.out.println(i);

		for (int i : arr3)
			System.out.println(i);

		int i = 0, j = 0, k = 0;
		System.out.println("The common elements are: ");

		while (i < arr1.length && j < arr2.length && k < arr3.length) {
			if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
				System.out.println(arr1[i]);
				i++;
				j++;
				k++;
			} else if (arr1[i] < arr2[j])
				i++;
			else if (arr2[j] < arr3[k])
				j++;
			else
				k++;
		}
	}

}
