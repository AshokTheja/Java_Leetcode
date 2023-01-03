package com.solved_Puzzles;

public class Region_Matches {

	public static void main(String[] args) {

		String searchMe = "Green Eggss and Ham";
		String findMe = "Eggs";

		int searchMeLength = searchMe.length();
		int findMeLength = findMe.length();
		boolean foundIt = false;

		for (int i = 0; i <= (searchMeLength - findMeLength); i++) {

			if (searchMe.regionMatches(i, findMe, 0, findMeLength)) {
				foundIt = true;
				System.out.println(searchMe.substring(i, i + findMeLength));
				break;
			}

		}
		if (!foundIt)
			System.out.println("No match found.");
	}

}
