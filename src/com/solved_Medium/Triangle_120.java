package com.solved_Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Triangle_120 {

	public int minimumTotal(List<List<Integer>> triangle) {

		int count = 0;
		int ii = 0, i2 = 0;

		for (List<Integer> now : triangle) {

			if (now.size() == 1) {
				count = count + now.get(0);
			} else if (now.size() == 2) {
				ii = Collections.min(now);
				count += ii;
				i2 = now.indexOf(ii);

			} else {
				int minIndex = 0, maxIndex = 0;
				if (i2 == 0) {
					minIndex = 0;
					maxIndex = 1;
				} else {
					minIndex = i2;
					maxIndex = i2 + 1;
				}

				int reqComp1 = now.get(minIndex);
				int reqComp2 = now.get(maxIndex);

				if (reqComp1 < reqComp2) {
					i2 = minIndex;
					count += reqComp1;
				} else if (reqComp2 < reqComp1) {
					count += reqComp2;
					i2 = maxIndex;
				}
			}
		}

		return count;

	}

	public static void main(String[] args) {
		Triangle_120 tri = new Triangle_120();

		List<List<Integer>> here = new ArrayList<>();

		List<Integer> inHere = new ArrayList<>();

		inHere.add(-1);

		here.add(inHere);

		List<Integer> inHere2 = new ArrayList<>();

		inHere2.add(2);
		inHere2.add(3);

		here.add(inHere2);

		List<Integer> inHere3 = new ArrayList<>();

		inHere3.add(1);
		inHere3.add(-1);
		inHere3.add(-3);

		here.add(inHere3);

//		List<Integer> inHere4 = new ArrayList<>();
//
//		inHere4.add(4);
//		inHere4.add(1);
//		inHere4.add(8);
//		inHere4.add(3);
//
//		here.add(inHere4);

		System.out.println(tri.minimumTotal(here));

	}

}
