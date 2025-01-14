package com.solved_Medium;

import java.util.ArrayList;
import java.util.List;

public class ContainerWithMostWater_11 {

	public static int maxArea(int[] height) {

		int current = 0, use = 0, big = 0;
		List<Integer> l1 = new ArrayList<>();

		for (int i = 0; i <= height.length - 2; i++) {

			for (int j = i + 1; j <= height.length - 1; j++) {
				use += 1;
				if (height[i] >= height[j] && current < use * height[j]) {
					current = use * height[j];
				} else if (height[i] < height[j] && current < use * height[j]) {
					current = use * height[i];
				}
				if (j == height.length - 1) {
					l1.add(current);
					current = 0;
					use = 0;
				}
			}
		}

		for (int k : l1)
			if (big < k)
				big = k;

		return big;

	}

	public static void main(String[] args) {
		int[] i1 = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		System.out.println(maxArea(i1));
	}
}
