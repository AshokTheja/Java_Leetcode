package com.solved_Medium;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsofPhoneNumbers_17 {

	public static void main(String[] args) {
		System.out.println(letterCombinations("5678"));
	}

	public static List<String> letterCombinations(String digits) {

		Map<Integer, String> map = new LinkedHashMap<>();
		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		List<Character> alphabeet = new ArrayList<>();
		List<Character> l1 = new ArrayList<>();
		List<String> l2 = new ArrayList<>();
		String s1 = "", s7 = "";
		List<String> l3 = new ArrayList<>();

		for (int i = 0; i <= alphabet.length - 1; i++) {
			alphabeet.add(alphabet[i]);
		}
		System.out.println(alphabeet);

		for (int i = 2; i <= 9; i++) {
			for (int j = 0; j <= alphabeet.size() - 1; j++) {
				if ((i == 7 || i == 9) && l1.size() < 4) {
					l1.add(alphabeet.get(j));
				} else if ((i != 7 || i != 9) && l1.size() < 3) {
					l1.add(alphabeet.get(j));
				}
			}
			alphabeet = alphabeet.subList(l1.size(), alphabeet.size());
			s1 = l1.toString();
			l1.removeAll(l1);
			map.put(i, s1);
		}
		System.out.println(map);

		for (int i = 0; i <= digits.length() - 1; i++) {
			char[] c = digits.toCharArray();
			int i1 = Integer.parseInt(String.valueOf(c[i]));
			l2.add(map.get(i1));
		}
		String cs1;
		String cs2;
		String cs3;
		String cs4;

		switch (l2.size()) {

		case 1:
			for (int i = 0; i <= l2.size() - 1; i++) {
				cs1 = l2.get(i).replaceAll("[, ]", "");
				char[] c1 = cs1.trim().toCharArray();
				for (int k = 0; k <= c1.length - 3; k++) {
					String fin = String.valueOf(c1[k + 1]);
					l3.add(fin);
					fin = "";
				}
			}
		case 2:
			for (int i = 0; i <= l2.size() - 1; i++) {
				for (int j = i + 1; j <= l2.size() - 1; j++) {
					cs1 = l2.get(i).replaceAll("[, ]", "");
					cs2 = l2.get(j).replaceAll("[, ]", "");
					char[] c1 = cs1.trim().toCharArray();
					char[] c2 = cs2.trim().toCharArray();
					for (int k = 0; k <= c1.length - 3; k++) {
						for (int l = 0; l <= c2.length - 3; l++) {
							String fin = String.valueOf(c1[k + 1]) + String.valueOf(c2[l + 1]) + s7;
							l3.add(fin);
							fin = "";

						}
					}
				}
			}
		case 3:
			for (int i = 0; i <= l2.size() - 1; i++) {
				for (int j = i + 1; j <= l2.size() - 1; j++) {
					for (int k = j + 1; k <= l2.size() - 1; k++) {
						cs1 = l2.get(i).replaceAll("[, ]", "");
						cs2 = l2.get(j).replaceAll("[, ]", "");
						cs3 = l2.get(k).replaceAll("[, ]", "");
						char[] c1 = cs1.trim().toCharArray();
						char[] c2 = cs2.trim().toCharArray();
						char[] c3 = cs3.trim().toCharArray();
						for (int l = 0; l <= c1.length - 3; l++) {
							for (int m = 0; m <= c2.length - 3; m++) {
								for (int n = 0; n <= c3.length - 3; n++) {
									String fin = String.valueOf(c1[l + 1]) + String.valueOf(c2[m + 1])
											+ String.valueOf(c3[n + 1]);
									l3.add(fin);
									fin = "";

								}
							}
						}
					}
				}
			}
		case 4:
			for (int i = 0; i <= l2.size() - 1; i++) {
				for (int j = i + 1; j <= l2.size() - 1; j++) {
					for (int k = j + 1; k <= l2.size() - 1; k++) {
						for (int l = k + 1; l <= l2.size() - 1; l++) {
							cs1 = l2.get(i).replaceAll("[, ]", "");
							cs2 = l2.get(j).replaceAll("[, ]", "");
							cs3 = l2.get(k).replaceAll("[, ]", "");
							cs4 = l2.get(l).replaceAll("[, ]", "");
							char[] c1 = cs1.trim().toCharArray();
							char[] c2 = cs2.trim().toCharArray();
							char[] c3 = cs3.trim().toCharArray();
							char[] c4 = cs4.trim().toCharArray();
							for (int m = 0; m <= c1.length - 3; m++) {
								for (int n = 0; n <= c2.length - 3; n++) {
									for (int o = 0; o <= c3.length - 3; o++) {
										for (int p = 0; p <= c4.length - 3; p++) {

											String fin = String.valueOf(c1[m + 1]) + String.valueOf(c2[n + 1])
													+ String.valueOf(c3[o + 1]) + String.valueOf(c4[p + 1]);
											l3.add(fin);
											fin = "";

										}
									}
								}
							}
						}
					}

				}

			}

		}
		return l3;
	}
}
