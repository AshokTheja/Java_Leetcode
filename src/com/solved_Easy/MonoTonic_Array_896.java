package com.solved_Easy;

public class MonoTonic_Array_896 {

	public static void main(String[] args) {

		int[] A = { 1, 2, 5, 5, 3 };
		System.out.println(isMonotonic(A));

	}

	public static boolean isMonotonic(int[] A) {
		boolean flag = true;
		String now = "";

		for (int i = 0; i <= A.length - 2; i++) {
			if (A[i] == A[i + 1]) {
				if (i == A.length - 2) {
					return true;
				} else {
					continue;
				}
			} else if ((A[i] >= A[i + 1])) {
				now = "Greater";
				break;
			} else if (A[0] <= A[1]) {
				now = "Lesser";
				break;
			}

		}

		if (now == "Greater") {

			for (int i = 0; i <= A.length - 2; i++) {
				Child: for (int j = i + 1; j <= A.length - 1; j++) {

					if (A[i] >= A[j]) {
						break Child;
					} else {
						flag = false;
					}
				}
			}

		} else if (now == "Lesser") {
			for (int i = 0; i <= A.length - 2; i++) {
				Child: for (int j = i + 1; j <= A.length - 1; j++) {
					if (A[i] <= A[j]) {
						break Child;
					} else {
						flag = false;
					}
				}
			}
		}

		return flag;
	}
}
