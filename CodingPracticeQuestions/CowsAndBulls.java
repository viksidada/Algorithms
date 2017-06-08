package com.CodingPracticeQuestions;

import java.util.Scanner;

public class CowsAndBulls {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Player A Enter word: " );
		String aWord = in.nextLine();
		System.out.println("Player B enter word: ");
		String bWord = in.nextLine();
		
		int aLength = aWord.length();
		int bLength = bWord.length();
		
		int cows = 0;
		int bulls = 0;
		
		for (int i = 0; i < bLength-1; i++) {
			for (int j = 0; j < aLength-1; j++)
			if (bWord.charAt(i) == aWord.charAt(j)) {
				if (i ==j) {
					bulls++;
				} else cows++;
			}  
		}
		
		System.out.println("Cows: " + cows + "  Bulls: " + bulls);
		
	}

}
