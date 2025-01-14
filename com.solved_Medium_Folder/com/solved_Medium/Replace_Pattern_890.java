package com.solved_Medium;

import java.util.ArrayList;
import java.util.List;

public class Replace_Pattern_890 {

	public static List<String> findAndReplacePattern(String[] words, String pattern) {

		List<String> setHere = new ArrayList<>();

		List<Integer> setHere2 = new ArrayList<>();
		List<Integer> setHere3 = new ArrayList<>();

		setHere2 = doNeedFul(pattern);

		for (String test : words) {

			setHere3 = doNeedFul(test);

			if (setHere2.equals(setHere3))
				setHere.add(test);

		}

		return setHere;

	}

	public static List<Integer> doNeedFul(String pattern) {

		List<Integer> setHere = new ArrayList<>();

		for (int i = 0; i <= pattern.length() - 1; i++) {

			setHere.add(pattern.lastIndexOf(pattern.charAt(i)));

		}

		return setHere;

	}

	public static void main(String[] args) {

		String[] words = { "badc", "abab", "dddd", "dede", "yyxx" };

		String pattern = "baba";

		System.out.println(findAndReplacePattern(words, pattern));

	}

}
