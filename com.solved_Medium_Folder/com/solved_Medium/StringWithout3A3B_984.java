package com.solved_Medium;

public class StringWithout3A3B_984 {

	public static String strWithout3a3b(int a, int b) {

		String s = "", big = "", small = "";
		char[] ch = new char[a + b];
		int count = 0, count1 = 0, count2 = 0;

		String as = "", bs = "";

		for (int i = 0; i < a; i++) {
			as = as + 'a';
		}

		for (int i = 0; i < b; i++) {
			bs = bs + 'b';
		}

		if (a <= 2 && b <= 2) {
			s = as + bs;
			return s;
		}

		if (as.length() > bs.length()) {
			big = as;
			small = bs;
		} else if (as.length() < bs.length()) {
			big = bs;
			small = as;
		} else {

			for (int i = 0; i <= ch.length - 1; i++) {
				int count3 = 0;
				ch[i] = as.charAt(count3);
				i += 1;
				ch[i] = bs.charAt(count3++);

			}

			s = String.valueOf(ch);
			return s;

		}

		if (big.length() - small.length() == 1) {

			for (int i = 0; i <= ch.length - 1; i++) {
				int count3 = 0;
				ch[i] = big.charAt(count3);
				i += 1;
				if (i != ch.length)
					ch[i] = small.charAt(count3++);

			}

			s = String.valueOf(ch);
			return s;

		}

		Parent: for (int i = 0; i <= ch.length - 1; i++) {

			ch[i] = big.charAt(count2++);
			count++;

			if (i == ch.length - 1)
				break;
			if ((count == 2 && i != ch.length - 1) || big.length() == count2) {
				i += 1;
				ch[i] = small.charAt(count1);
				count1 += 1;
				count = 0;
			}
			if (big.length() == count2 && i != ch.length - 1) {
				for (int k = count1; k <= small.length(); k++)
					ch[i + 1] = small.charAt(count1);

				break Parent;
			}
		}

		s = String.valueOf(ch);
		return s;
	}

	public static void main(String[] args) {
		System.out.println(strWithout3a3b(27, 33));
	}

}
