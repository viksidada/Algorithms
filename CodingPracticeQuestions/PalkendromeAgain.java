package com.CodingPracticeQuestions;

public class PalkendromeAgain {

	public static void main(String[] args) {
		String test = "abccbah";
		boolean value = true;
		
		if (test.length() == 0) {
			System.out.println("Empty String");
		}
		
		for (int i = 0; i < test.length() / 2; i++) {
			if (test.charAt(i) != test.charAt(test.length()-1-i) ) {
				value = false;
				break;
			}
		}
		
		if (value) {
			System.out.println("Palendrome");
		} else System.out.println("Not a Palendrome");

	}

}
