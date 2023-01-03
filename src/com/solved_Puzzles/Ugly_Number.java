package com.solved_Puzzles;

public class Ugly_Number {

	public static void main(String[] args) {

		int n = 1000000000, a = 2, b = 217983653, c = 336916467;
		System.out.println(nthUglyNumber(n, a, b, c));
	}

	public static int nthUglyNumber(int n, int a, int b, int c) {

		int count = 0, found = 0;

		for (int i = 2; i <= 1999999988; i++) {
			if ((i % a == 0) || (i % b == 0) || (i % c == 0)) {
				count++;

				if (count == n) {
					found = i;
					break;
				}
			}

		}
		return found;
// ------------------------------------------------------------------
//		 int count = 0, i = 2;
//
//		while (n > count) {
//
//			if ((i % a == 0) || (i % b == 0) || (i % c == 0))
//				count++;
//			i++;
//		}	
	}
}
