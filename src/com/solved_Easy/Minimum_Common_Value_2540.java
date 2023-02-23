package com.solved_Easy;

public class Minimum_Common_Value_2540 {

	public static void main(String[] args) {

		Minimum_Common_Value_2540 mcv = new Minimum_Common_Value_2540();

		int[] nums1 = { 1, 2, 3 }, nums2 = { 2, 4 };

		System.out.println(mcv.getCommon(nums1, nums2));

	}

	public int getCommon(int[] nums1, int[] nums2) {

		int minValue = -1;

		parent: for (int i1 = 0; i1 <= nums1.length - 1; i1++) {

			child: for (int i2 = 0; i2 <= nums2.length - 1; i2++) {

				if (nums1[i1] == nums2[i2]) {
					return nums1[i1];
				} else if (nums1[i1] < nums2[i2]) {
					i2--;
					continue parent;
				} else if (nums1[i1] > nums2[i2]) {
					continue child;

				}

			}

		}

		return minValue;

	}

}
