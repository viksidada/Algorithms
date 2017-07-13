package com.Big4Questions;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class CowsAndBulls {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		System.out.println("Please enter the Guess word: ");
//		String word1 = in.next();
		String word1 = "9305";
		System.out.println("Please enter the Guess: ");
		String word2 = in.next();

		int cows = 0;
		int bulls = 0;
		Set<Integer> mySet = new LinkedHashSet<Integer>();

		for (int i = 0; i < word1.length(); i++) {
			for (int j = 0; j < word2.length(); j++) {
				
				if (word1.charAt(i) == word2.charAt(i)) {
					bulls++;
					break;
				}
				
				if (word1.charAt(i) == word2.charAt(j)) {
					if (mySet.contains(j)) {
						continue;
					}
					
					if (i == j) {
						bulls++;
					} else cows++;
					mySet.add(j);
				}
			}
		}

		System.out.println("Cows: " + cows + " and Bulls: " + bulls);
	}

}
