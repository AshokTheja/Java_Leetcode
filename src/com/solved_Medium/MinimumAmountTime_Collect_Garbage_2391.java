package com.solved_Medium;

public class MinimumAmountTime_Collect_Garbage_2391 {

	public static int garbageCollection(String[] garbage, int[] travel) {

		int here = 0;

		String[] now = { "M", "P", "G" };

		int[] test = { 0, 0, 0 };

		for (int i = 0; i <= garbage.length - 1; i++) {

			if (garbage[i].contains("M")) {
				test[0] = i;
			}
			if (garbage[i].contains("P")) {
				test[1] = i;
			}
			if (garbage[i].contains("G")) {
				test[2] = i;
			}

		}

		for (int j = 0; j <= test.length - 1; j++) {

			if (test[j] >= 0) {
				here += calculateHere(now[j], test[j], garbage, travel);
			}
		}

		return here;
	}

	public static int calculateHere(String a, int b, String[] garbage, int[] travel) {
		int now = 0;

		for (int i = 0; i <= b; i++) {

			String[] here = garbage[i].split("");

			for (int j = 0; j <= here.length - 1; j++) {
				if (here[j].equals(a)) {
					now += 1;
				}

			}

			if (i > 0) {
				now += travel[i - 1];
			}

		}

		return now;
	}

	public static void main(String[] args) {

		String[] garbage = { "G", "M" };

		int[] travel = { 1 };

		System.out.println(garbageCollection(garbage, travel));
	}

}
