package com.solved_Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Word_Break_139 {

	public boolean wordBreak(String s, List<String> wordDict) {

		int value = 0;
		boolean hh = true;

		Collections.sort(wordDict, (a, b) -> Integer.compare(a.length(), b.length()));
		
		for (int i = 0; i <= wordDict.size() - 1; i++) {
			String here = wordDict.get(i);
			if (s.contains(here)) {
				s = s.replaceFirst(here, "");
				hh = s.isEmpty();
			}

			if (i == wordDict.size() - 1 && hh == false && value != s.length()) {
				value = s.length();
				i = -1;
			}
		}

		if (s.length() == 0) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		Word_Break_139 wb = new Word_Break_139();

		List<String> here = new ArrayList<>();
		Collections.addAll(here, "cats", "dog", "sand", "and", "cat");

		String s = "catsandog";

		System.out.println(wb.wordBreak(s, here));

	}

}
