package com.solved_Puzzles;

import java.util.ArrayList;
import java.util.List;

public class GroupingTransactions_ByItemNames {

	public static void main(String[] args) {

		String[] transactions = { "bat", "notebook", "test", "notebook", "notebook", "keyboard", "mouse", "keyboard",
				"mouse", "keyboard", "bat", "bat", "bat", "mouse", "test" };
		List<String> main = new ArrayList<>();
		List<String> help = new ArrayList<>();

		int count = 1;

		for (int i = 0; i <= transactions.length - 1; i++) {

			for (int j = i + 1; j <= transactions.length - 1; j++) {

				if (i == transactions.length - 1) {
					j = j - 1;
					if (transactions[i] == transactions[j] && !main.contains(transactions[i])) {
						count += 1;
					}
				} else if (transactions[i] == transactions[j] && !main.contains(transactions[i])) {
					count += 1;
				}

			}

			if (!help.contains(transactions[i])) {
				help.add(transactions[i]);
				main.add(transactions[i] + " " + count);
				count = 1;
			}

		}
		System.out.println(main);

	}
}
