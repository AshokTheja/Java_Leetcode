package com.solved_Hard;

public class Digit_one {

	public static void main(String[] args) {

		int n = 824883294;
		System.out.println(countDigitOne(n));
	}

	public static int countDigitOne(int n) {

		int now = 0;

		for (int i = 1; i <= n; i++) {

			String s = Integer.toString(i);

			if (s.contains("1")) {
				char[] test = s.toCharArray();
				for (char k : test) {
					if (k == '1')
						now += 1;
				}
			} else {
				continue;
			}

		}
		return now;
	}
}
