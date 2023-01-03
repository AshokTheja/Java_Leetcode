package com.solved_Puzzles;

import java.util.HashMap;
import java.util.Map;

public class DupsCount_UsingMaps_Type2 {

	public static void main(String[] args) {
		String input = "ab ab bc cd cd de";
		Map<String, Integer> resultMap = new HashMap<>();
		for (String s : input.split(" ")) {
			if (resultMap.containsKey(s)) {
				resultMap.put(s, resultMap.get(s) + 1);
			} else {
				resultMap.put(s, 1);
			}
		}

		for (Map.Entry<String, Integer> resultMapEntry : resultMap.entrySet()) {
			if (resultMapEntry.getValue() > 1) {
				System.out.println(
						"word " + resultMapEntry.getKey() + " repeated " + resultMapEntry.getValue() + " times");
			}
		}
	}
}
