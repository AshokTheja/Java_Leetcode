package com.solved_Easy;

public class GreatestCommonDivisor_Strings_1071 {

	public String gcdOfStrings(String str1, String str2) {

		String bigger = str1.length() > str2.length() ? str1 : str2;

		String smaller = str1.length() < str2.length() ? str1 : str2;

		if (str1.length() == str2.length() && !str1.contentEquals(str2)) {

			return "";
		}

		for (int i = smaller.length(); i > 0; i--) {

			String now = smaller.substring(0, i);
			String now1 = bigger;

			if (smaller.length() % now.length() == 0 && bigger.length() % now.length() == 0) {
				while (!now1.equals("")) {
					if (now1.substring(0, now.length()).equals(now)) {
						now1 = now1.substring(now.length(), now1.length());
					} else {
						break;
					}
				}
				if (now1.equals("")) {
					return now;
				}
			} else if ((!now1.contains(String.valueOf(now.charAt(i - 2) + String.valueOf(now.charAt(i - 1)))))) {
				return "";
			} else {
				continue;
			}

		}

		return "";

	}

	public static void main(String[] args) {

		GreatestCommonDivisor_Strings_1071 gcd = new GreatestCommonDivisor_Strings_1071();

		System.out.println("Final: "
				+ gcd.gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"));

	}

}
