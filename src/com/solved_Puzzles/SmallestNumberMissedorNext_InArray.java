package com.solved_Puzzles;

import java.util.Arrays;

//Program to find the smallest Positive integer missed in an given array of size n and 
//range between -nve, 0 and +ve integers.

public class SmallestNumberMissedorNext_InArray {

	public static void main(String[] args) {
		SmallestNumberMissedorNext_InArray sol = new SmallestNumberMissedorNext_InArray();

		int[] test = { -1, -2, 0, 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println("Smallest number Missed/Next in the array: " + sol.solution(test));

	}

	public int solution(int[] A) {

		Boolean flag = true;
		int result = 0;
		Arrays.sort(A);
		for (int i : A) {
			if (i <= 0) {
				System.out.println("No Positive Integer sign");
			} else {
				System.out.println("Array Have Positive Integer");
				flag = false;
				break;
			}
		}
		if (flag == true) {
			result = 1;
		}

		if (flag == false) {
			Master: for (int i = 0; i < A.length; i++) {
				if (A[i] <= 0) {
					continue;
				} else if (A[i] > 0) {
					for (int j = 0; j < A.length; j++) {
						if (i == A.length) {
							result = j + 1;
							break Master;
						}
						if (A[i] != j + 1) {
							result = j + 1;
							break Master;
						} else {
							i = i + 1;
						}
					}

				}
			}
		}
		return result;
	}
}
