package com.solved_Puzzles;

import java.util.ArrayList;
import java.util.List;

public class SizeOfTheBiggestSequence_InArray {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		int[] tickets = { 1, 2, 3, 4, 4, 8, 9, 10, 11, 12, 13, 16, 17, 18, 19, 20, 20, 20, 21, 22 };

		List<Integer> m = new ArrayList<>();
		int size = 0;

		for (int i = 0; i <= tickets.length - 2; i++) {
			Child: for (int j = i + 1; j <= tickets.length - 1; j++) {

				if ((tickets[i] == tickets[j]) || (tickets[i] + 1 == tickets[j])) {
					if (m.size() == 0) {
						m.add(tickets[i]);
						m.add(tickets[j]);
						break Child;
					} else {
						m.add(tickets[j]);
						break Child;
					}
				} else {
					System.out.println("Current biggest sequence is the following: " + m.size());
					for (int i1 : m) {
						System.out.println(i1);
					}
					if (size == 0) {
						size = m.size();
						m.removeAll(m);
					} else if (m.size() > size) {
						size = m.size();
						m.removeAll(m);
					}
					break Child;
				}
			}
			continue;

		}
		if (m.size() > size)
			size = m.size();
		System.out.println("Final Biggest sequece is the following: " + size);
		for (int i1 : m) {
			System.out.println(i1);
		}

	}
}
