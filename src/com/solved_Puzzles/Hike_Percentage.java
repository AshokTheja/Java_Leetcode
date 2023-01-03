package com.solved_Puzzles;

import java.util.Scanner;

public class Hike_Percentage {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your new CTC");
		double newCTC = in.nextDouble();
		System.out.println("Please enter your old CTC");
		double oldCTC = in.nextDouble();

		double hike_Percenatage = ((newCTC - oldCTC) / oldCTC) * 100;

		int hike_Final = (int) hike_Percenatage;

		System.out.println("The hike obtained % in Integer: " + hike_Final);
		System.out.println("The hike obtained % in Double: " + hike_Percenatage);

	}

}
