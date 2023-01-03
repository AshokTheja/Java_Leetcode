package com.solved_Puzzles;

import java.util.LinkedHashMap;
import java.util.LinkedList;

//Program to find the count of PLC's in run mode from total of 1100, after operations performed 
//on them by 1100 employees.

public class FinalCountof_PLCSinRunMode {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> plcs = new LinkedHashMap<>();

		int i = 1;
		while (plcs.size() < 1100) {
			i = plcs.size() + 1;
			plcs.put(i, null);
		}

		System.out.println(plcs);

		LinkedList<Integer> employees = new LinkedList<>();
		employees.add(1);

		int j = 1;
		while (employees.size() < 1100) {
			j = employees.size() + 1;
			employees.add(j);
		}

		System.out.println(employees);

		for (int k = 0; k < employees.size() - 1; k++) {
			if (k == 0) {
				for (int l = 1; l <= employees.size(); l++) {
					plcs.put(l, "run");
				}
				System.out.println("Employee: " + k + ":" + plcs);
				continue;
			}
			if (k == 1) {
				int i1 = k + 1;
				while (i1 <= employees.size()) {
					plcs.put(i1, "program");
					i1 = i1 + 2;
				}
				System.out.println("Employee: " + k + ":" + plcs);
				continue;
			}

			if (k >= 2) {
				int i2 = k + 1;
				while (i2 <= employees.size()) {
					if (plcs.get(i2).equals("run")) {
						plcs.put(i2, "program");
					} else if (plcs.get(i2).equals("program")) {
						plcs.put(i2, "run");
					}
					i2 = i2 + k + 1;
				}
				continue;
			}

		}

		System.out.println("final PLC modes: " + plcs);

		int count = 0;
		for (int i3 = 0; i3 < plcs.size() - 1; i3++) {
			if (plcs.get(i3 + 1).equals("run")) {
				count += 1;
			}
		}
		System.out.println("final Count of PLCs in run mode: " + count);
	}

}
