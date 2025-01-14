package com.solved_Elimination_Game_390;

import java.util.ArrayList;
import java.util.List;

public class Elimination_Game_390 {

	public static void main(String[] args) {
		Elimination_Game_390 eg = new Elimination_Game_390();

		System.out.println("Req: " + eg.lastRemaining(1000000));

	}

	public int lastRemaining(int n) {

		List<Integer> here = new ArrayList<>();

		for (int i = 0; i <= n - 1; i++) {
			here.add(i + 1);
		}

		if (n == 0 || n == 1) {
			return n;
		}

		String now = "";
		int required = 0;

		parent: while (here.size() != 1) {

			if (now == "Starts" | now == "") {

				for (int i = 0; i <= here.size() - 1; i++) {

					if (here.size() != 1) {
						here.remove(i);
					}
					if (here.size() == 1) {
						required = here.get(0);
						break parent;
					}

				}

				now = "Ends";

			} else if (now == "Ends") {

				for (int i = here.size() - 1; i >= 0; i--) {

					if (here.size() != 1) {
						here.remove(i);
						i--;
					}
					if (here.size() == 1) {
						required = here.get(0);
						break parent;
					}

				}

				now = "Starts";

			}

		}

		return required;

	}

}
