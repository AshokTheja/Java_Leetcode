package com.solved_Easy;

public class ExcelSheet_ColumnTitle_168 {

	public static String convertToTitle(int columnNumber) {

		String here = "";

		int just = calculationRemainder(columnNumber);

		System.out.println(calculationRemainder(columnNumber));

		System.out.println(Alphabet(columnNumber, just));

//		ArrayList<Character> test = new ArrayList<>();
//
//		for (Character i = 'A'; i <= 'Z'; i++) {
//			test.add(i);
//		}
//
//		do {
//			int test3 = calculationRemainder(columnNumber);
//
//			here = here + test.get(Alphabet(columnNumber, test3) - 1);
//
//		} while ((calculationRemainder(columnNumber) != 0));
//
//		{
//
//		}
//		;

		return here;

	}

	public static int calculationRemainder(int colNum) {

		return 26 / colNum;
	}

	public static int Alphabet(int colNum, int test) {

		return colNum - (26 * test);
	}

	public static void main(String[] args) {

		int columnNumber = 26;

		System.out.println(convertToTitle(columnNumber));

	}

}
