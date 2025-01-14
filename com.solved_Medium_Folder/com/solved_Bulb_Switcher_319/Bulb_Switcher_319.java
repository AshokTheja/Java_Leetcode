package com.solved_Bulb_Switcher_319;

public class Bulb_Switcher_319 {

	public static void main(String[] args) {

		Bulb_Switcher_319 bs = new Bulb_Switcher_319();

		System.out.println(bs.bulbSwitch(10000000));

	}

	public int bulbSwitch(int n) {

		int now = 0;
		String[] here = new String[n];

		if (n == 0 || n == 1) {
			return n;
		}

		first: for (int i = 1; i <= n; i++) {

			if (i == 1) {
				for (int j = i; j <= n; j++) {
					here[j - 1] = "ON";
					now += 1;
				}
				continue;
			} else if (i == n) {
				if (here[i - 1].equals("OFF")) {
					here[i - 1] = "ON";
					now += 1;
				} else {
					here[i - 1] = "OFF";
					now -= 1;
				}
			} else {
				for (int k = i; k <= n; k++) {
					if (here[k - 1].equals("OFF")) {
						here[k - 1] = "ON";
						now += 1;
						k = (k + i) - 1;
						if (k > n)
							continue first;
					} else if (here[k - 1].equals("ON")) {
						here[k - 1] = "OFF";
						now -= 1;
						k = (k + i) - 1;
						if (k > n)
							continue first;
					}
				}
			}
		}

		return now;

	}

}
