package com.solved_Medium;

import java.util.ArrayList;

public class WinnerOf_Circular_Game_1823 {

	public static int findTheWinner(int n, int k) {

		int now = 0;

		ArrayList<Integer> here1 = new ArrayList<Integer>();

		for (int i = 0; i <= n - 1; i++) {
			here1.add(i + 1);
		}
		
		if(k == 1) {
			return here1.get(n-1);
		}

		for (int j = 1; j <= here1.size(); j++) {

			if (j % k != 0) {
				now = here1.get(here1.size() - 1);
				here1.add(here1.get(j - 1));
				here1.set(j - 1, 0);
			} else {
				here1.set(j - 1, 0);
			}

		}

		return now;

	}

	public static void main(String[] args) {

		int n = 3, k = 1;

		System.out.println(findTheWinner(n, k));
	}

}
