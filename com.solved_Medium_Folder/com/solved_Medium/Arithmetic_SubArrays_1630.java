package com.solved_Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arithmetic_SubArrays_1630 {

	public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {

		List<Boolean> here = new ArrayList<>();

		for (int i = 0; i <= l.length - 1; i++) {

			int[] now = Arrays.copyOfRange(nums, l[i], r[i] + 1);

			now = just(now);

			boolean flag = false;
			for (int j = 0; j <= now.length - 2; j++) {
				if ((now[j + 1] - now[j]) == (now[1] - now[0])) {
					flag = true;
					continue;
				} else if ((now[j + 1] - now[j]) != (now[1] - now[0])) {
					flag = false;
					break;
				}

			}

			here.add(flag);

		}

		return here;

	}

	public static int[] just(int[] now) {

		for (int p = 0; p <= now.length - 2; p++) {

			for (int k = p + 1; k <= now.length - 1; k++) {

				if (now[p] > now[k]) {

					int i = now[p];
					now[p] = now[k];
					now[k] = i;
				}

			}
		}

		return now;

	}

	public static void main(String[] args) {

		int[] nums = { -12,-9,-3,-12,-6,15,20,-25,-20,-15,-10 }, l = { 0,1,6,4,8,7 }, r = { 4,4,9,7,9,10 };

		System.out.println(checkArithmeticSubarrays(nums, l, r));

	}

}
