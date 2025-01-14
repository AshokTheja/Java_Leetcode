package com.solved_Medium;

public class LaserBeams_InBank_2125 {

	public static int numberOfBeams(String[] bank) {

		int here = 0;

		for (int i = 0; i <= bank.length - 2; i++) {

			if (bank[i].contains("1")) {

				child: for (int j = i + 1; j <= bank.length - 1; j++) {

					if (bank[j].contains("1")) {

						here += countOnes(bank[i]) * countOnes(bank[j]);

						break child;

					} else {
						continue;
					}

				}

			}

		}

		return here;

	}

	public static int countOnes(String now) {

		int here = 0;

		String[] test = now.split("");

		for (String just : test) {
			if (just.equals("1"))
				here += 1;
		}

		return here;

	}

	public static void main(String[] args) {

		String[] bank = { "000", "111", "000" };

		System.out.println(numberOfBeams(bank));
	}

}
