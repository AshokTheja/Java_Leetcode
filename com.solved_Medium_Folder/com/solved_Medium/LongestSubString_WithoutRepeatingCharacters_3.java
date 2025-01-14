package com.solved_Medium;

import java.util.ArrayList;
import java.util.List;

public class LongestSubString_WithoutRepeatingCharacters_3 {

	static List<Character> s1 = new ArrayList<>();

	public static int lengthOfLongestSubstring(String s) {
		char[] c1 = s.toCharArray();
		int count = 0;
		int count1 = 0;
		List<Character> l1 = new ArrayList<>();

		for (int i = 0; i <= c1.length - 1; i++) {
			if (!l1.contains(c1[i])) {
				l1.add(c1[i]);
				count = l1.size();
			} else if (l1.contains(c1[i])) {
				for (int i1 = 0; i1 <= l1.size() - 1; i1++) {
					if (l1.get(i1).equals(c1[i])) {
						if (count1 < l1.size()) {
							count1 = l1.size();
						}

						l1 = l1.subList(i1 + 1, l1.size());
						i = i - 1;
						i1 = l1.size() - 1;
					} else {
						continue;
					}

				}
			}
		}
		if (count > count1)
			return count;
		else
			return count1;

	}

	public static void main(String[] args) {

		System.out.println(lengthOfLongestSubstring("ckilbkd"));

	}

}
