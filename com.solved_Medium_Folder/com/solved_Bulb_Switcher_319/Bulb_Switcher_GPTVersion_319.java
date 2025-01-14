package com.solved_Bulb_Switcher_319;

public class Bulb_Switcher_GPTVersion_319 {

	public static void main(String[] args) {

		Bulb_Switcher_GPTVersion_319 bs = new Bulb_Switcher_GPTVersion_319();

		System.out.println(bs.bulbSwitch(99999999));
	}

	public int bulbSwitch(int n) {
		
		int now = 0;
		boolean[] bulbs = new boolean[n]; // Default value is false ("OFF")

		for (int i = 1; i <= n; i++) {
			for (int k = i - 1; k < n; k += i) {
				bulbs[k] = !bulbs[k]; // Toggle bulb
			}
		}

		for (boolean bulb : bulbs) {
			if (bulb)
				now++;
		}

		return now;
	}

}
