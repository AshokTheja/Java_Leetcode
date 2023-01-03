package com.solved_Easy;

import java.util.Arrays;

public class DeleteColumnsandSort_944 {

	public int minDeletionSize(String[] strs) {

		String[] here1 = new String[strs[0].length()];
		int now1 = 0;

		for (int j = 0; j <= strs[0].length() - 1; j++) {

			String now = "";

			for (int i = 0; i <= strs.length - 1; i++) {

				now = now + strs[i].charAt(j) + "";

			}

			here1[j] = now;

		}

		for (int k = 0; k <= here1.length - 1; k++) {

			String nowHere = here1[k];
			char[] ch = nowHere.toCharArray();
			Arrays.sort(ch);
			String hh = new String(ch);

			if ((hh.equals(here1[k]))) {
				continue;
			} else {
				now1 += 1;
			}

		}

		return now1;

	}

	public static void main(String[] args) {

		DeleteColumnsandSort_944 ds = new DeleteColumnsandSort_944();

		String[] here = { "a", "b" };

		System.out.println(ds.minDeletionSize(here));

	}

}
