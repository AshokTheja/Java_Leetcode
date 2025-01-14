package com.solved_Elimination_Game_390;

import java.util.LinkedList;

public class Elimination_Game_390_Second {

	public static void main(String[] args) {
		Elimination_Game_390_Second eg = new Elimination_Game_390_Second();

		System.out.println("Req: " + eg.lastRemaining(20));

	}

	public int lastRemaining(int n) {

		int j = 2, k = 4;

		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();

		for (int i = 1; i <= n; i++) {
			list1.add(i);
		}

		System.out.println(list1.size());

		while (list1.size() > 1) {

			if (list1.size() % 2 == 0) {

				for (int l = 2; l <= list1.size(); l += 4) {
					list2.add(l);
				}

			} else {

				for (int l = 4; l <= list1.size(); l += 4) {
					list2.add(l);
				}

			}

			list1.removeAll(list1);
			list1.addAll(list2);
			list2.removeAll(list2);
		}

		return list1.get(0);

	}

}
