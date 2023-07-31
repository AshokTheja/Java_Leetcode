package com.solved_Easy;

public class Employees_Met_Traget {

	public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {

		int here = 0;

		for (int i = 0; i <= hours.length - 1; i++) {
			if (hours[i] >= target) {
				here += 1;
			}
		}

		return here;

	}

	public static void main(String[] args) {

		Employees_Met_Traget newh = new Employees_Met_Traget();

		int[] hours = { 0, 1, 2, 3, 4 };

		System.out.println(newh.numberOfEmployeesWhoMetTarget(hours, 2));

	}
}
