package com.solved_Medium;

public class First_Occurence_In_String_28 {

	public int strStr(String haystack, String needle) {
		
		
		return haystack.indexOf(needle);
		

	}

	public static void main(String[] args) {

		String first = "sseadbutsead";
		String second = "sad";

		First_Occurence_In_String_28 str = new First_Occurence_In_String_28();

		System.out.println(str.strStr(first, second));
	}

}
