package com.solved_Puzzles;

import java.util.Scanner;

public class Salary_Using_Percentage {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your current CTC: ");
		double current_CTC = in.nextDouble();
		System.out.println("Plesae enter you Percentage_Increment");
		double percentage_Increment = in.nextDouble();

		double Salary_After_Hike = ((current_CTC * percentage_Increment) / 100) + current_CTC;

		System.out.println(Salary_After_Hike);

	}

}
