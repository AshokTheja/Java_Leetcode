package com.solved_Easy;

public class Convert_Temperature_2469 {

	public static void main(String[] args) {

		Convert_Temperature_2469 ct = new Convert_Temperature_2469();

		System.out.println(ct.convertTemperature(36.50));

	}

	public double[] convertTemperature(double celsius) {

		double[] here = { (celsius + 273.15), ((celsius * 1.80) + 32.00) };

		return here;

	}

}
