package com.solved_Medium;

public class Minimize_MaxOf_twoNumber_2513 {

	public static void main(String[] args) {

		Minimize_MaxOf_twoNumber_2513 mmt = new Minimize_MaxOf_twoNumber_2513();

		System.out.println(mmt.minimizeSet(2, 7, 1, 3));

	}

	public int minimizeSet(int divisor1, int divisor2, int uniqueCnt1, int uniqueCnt2) {

		int[] first = new int[uniqueCnt1];
		int[] second = new int[uniqueCnt2];

		int firstArrSize = 0, secondArrSize = 0;

		for (int i = 1; i <= Integer.MAX_VALUE; i++) {

			if (i % divisor1 != 0 && i % divisor2 != 0) {

				if ((uniqueCnt1 > uniqueCnt2 && firstArrSize < uniqueCnt1)
						|| (secondArrSize == uniqueCnt2 && firstArrSize < uniqueCnt1)) {
					first[firstArrSize] = i;
					firstArrSize += 1;
				} else if ((uniqueCnt2 > uniqueCnt1 && secondArrSize < uniqueCnt2)
						|| (firstArrSize == uniqueCnt1 && secondArrSize < uniqueCnt2)) {
					second[secondArrSize] = i;
					secondArrSize += 1;
				}

				continue;

			} else if (i % divisor1 != 0 && i % divisor2 == 0 && firstArrSize < uniqueCnt1) {
				first[firstArrSize] = i;
				firstArrSize += 1;
				continue;

			} else if (i % divisor1 == 0 && i % divisor2 != 0 && secondArrSize < uniqueCnt2) {
				second[secondArrSize] = i;
				secondArrSize += 1;
				continue;
			}

			if (firstArrSize == uniqueCnt1 && secondArrSize == uniqueCnt2) {
				break;
			}

		}

		return first[uniqueCnt1 - 1] > second[uniqueCnt2 - 1] ? first[uniqueCnt1 - 1] : second[uniqueCnt2 - 1];
	}

}
