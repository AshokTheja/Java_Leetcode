package com.solved_Puzzles;

//Program to find the less number of changes required for the n number of coins as input with any random flip side. 
public class LessNumberofChangesReq_FlippingCoins {

	public static void main(String[] args) {

		LessNumberofChangesReq_FlippingCoins coin = new LessNumberofChangesReq_FlippingCoins();
		int[] test = { 0, 1, 1, 0, 1, 1, 0, 0, 1, 1 };

		System.out.println(coin.solution(test));
	}

	public int solution(int[] A) {

		int N = A.length;
		int countsifZero = 0;
		int countsifOne = 0;

		if (A[0] == 0) {

			for (int i = 0; i < N; i++) {
				if (i == N - 1) {
					break;
				}
				if (A[i] != 0) {
					countsifZero += 1;
				} else if ((A[i] == 0 && A[i + 1] != 1)) {
					countsifZero += 1;
				}

				i = i + 1;
			}
		} else {

			for (int i = 0; i < N; i++) {
				if (i == N - 1) {
					break;
				}
				if (A[i] != 1) {
					countsifOne += 1;
				} else if ((A[i] == 1 && A[i + 1] != 0)) {
					countsifOne += 1;
				}

				i = i + 1;
			}

		}

		if (countsifZero > countsifOne)
			return countsifZero;
		else
			return countsifOne;

	}
}
