package com.solved_Easy;

public class Categorize_Box_Criteria_2525 {

	public static void main(String[] args) {

		Categorize_Box_Criteria_2525 cbc = new Categorize_Box_Criteria_2525();

		int length = 1000, width = 1000, height = 1000, mass = 1000;

		System.out.println(cbc.categorizeBox(length, width, height, mass));

	}

	public String categorizeBox(int length, int width, int height, int mass) {

		String test = "";
		boolean bulky = false, heavy = false;

		long volume = Integer.toUnsignedLong(length) * Integer.toUnsignedLong(width) * Integer.toUnsignedLong(height);

		if (length >= 10000 || width >= 10000 || height >= 10000 || volume >= 1000000000) {

			bulky = true;

		}

		if (mass >= 100) {

			heavy = true;
		}

		if (bulky && heavy) {
			test = "Both";
		} else if (!bulky && !heavy) {
			test = "Neither";
		} else if (bulky && !heavy) {
			test = "Bulky";
		} else if (heavy && !bulky) {
			test = "Heavy";
		}

		return test;

	}

}
