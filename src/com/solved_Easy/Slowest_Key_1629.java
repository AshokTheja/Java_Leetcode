package com.solved_Easy;

import java.util.ArrayList;

public class Slowest_Key_1629 {

	public static void main(String[] args) {

		int[] releaseTimes = { 9, 29, 49, 50 };
		String keyPressed = "cbcd";
		System.out.println(slowestKey(releaseTimes, keyPressed));
	}

	public static char slowestKey(int[] releaseTimes, String keyPressed) {

		char c = 'p';
		char[] ch = keyPressed.toCharArray();

		int[] now = new int[releaseTimes.length];

		for (int i = 0; i <= releaseTimes.length - 1; i++) {
			if (i == 0) {
				now[i] = releaseTimes[i];
			} else {
				now[i] = releaseTimes[i] - releaseTimes[i - 1];
			}
		}

		int big = 0;

		for (int i = 0; i <= releaseTimes.length - 1; i++) {
			if (now[i] > big)
				big = now[i];

		}

		ArrayList<Integer> al = new ArrayList<>();

		for (int i = 0; i <= releaseTimes.length - 1; i++) {
			if (now[i] == big)
				al.add(i);
		}

		if (al.size() == 1) {
			int in = al.get(0);
			c = ch[in];
		} else {
			ArrayList<Character> al1 = new ArrayList<>();
			for (int i : al) {
				al1.add(ch[i]);
			}
			for (int i = 0; i <= al1.size() - 2; i++) {
				c = al1.get(i);
				if (c > al1.get(i + 1)) {
					c = al1.get(i);
				} else {
					c = al1.get(i + 1);
				}
			}
		}

		return c;
	}
}
