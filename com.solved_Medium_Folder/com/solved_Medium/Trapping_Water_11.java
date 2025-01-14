package com.solved_Medium;

import java.util.ArrayList;
import java.util.List;

public class Trapping_Water_11 {

	public static void main(String[] args) {

		int[] height = { 4, 2, 3 };

		System.out.println(trap(height));

	}

	public static int trap(int[] height) {

		List<Integer> l1 = new ArrayList<>();
		List<Integer> temp = new ArrayList<>();
		int count = 0;
		boolean flag = false;

		for (int l = 0; l <= height.length - 1; l++) {
			l1.add(height[l]);
		}

		while (l1.size() > 2) {
			Master: for (int i = 0; i <= l1.size() - 2; i++) {
				for (int j = i + 1; j <= l1.size() - 1; j++) {
					if (i == 0 && l1.get(i) == l1.get(i + 1)) {
						l1 = l1.subList(i + 1, l1.size());
					}

					if (l1.size() == 3) {
						if (l1.get(j) > l1.get(i) || l1.get(j + 1) < l1.get(j)) {
							count = count + 0;
						} else if (l1.get(j + 1) < l1.get(i)) {
							count = count + (l1.get(j + 1) - l1.get(j));
						} else {
							count = count + (l1.get(i) - l1.get(j));
						}
						flag = true;
						l1.removeAll(l1);
						break Master;
					}

					if (l1.get(i) <= l1.get(j) && flag == false) {
						temp.addAll(l1.subList(i, j + 1));
						l1 = l1.subList(j, l1.size());
					}

					if (temp.size() >= 2 && flag == false) {
						int k = temp.get(0);
						for (int l = temp.size() - 1; l >= 0; l--) {
							if (temp.get(l) >= k)
								count = count + (k - k);
							else
								count = count + (k - temp.get(l));
						}

					}
					if (temp.size() == 0 && flag == false)
						continue;
					else {
						temp.removeAll(temp);
						break Master;
					}

				}

			}
		}

		return count;

	}

}
