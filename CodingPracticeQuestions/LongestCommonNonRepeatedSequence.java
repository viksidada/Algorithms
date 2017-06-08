package com.CodingPracticeQuestions;

import java.util.LinkedHashSet;
import java.util.Set;

public class LongestCommonNonRepeatedSequence {

	public static void main(String[] args) {
		String s = "pwwkew";

		String max = "";
		String currentMax = "";

		Set<Character> newSet = new LinkedHashSet<Character>();

		for (int i = 0; i < s.length(); i++) {
			if (!newSet.contains(s.charAt(i))) {
				newSet.add(s.charAt(i));
				currentMax += s.charAt(i);
				System.out.println(currentMax);

			} else {
				System.out.println(newSet + "++++");
				newSet.clear();
				currentMax = "";

			}

			if (currentMax.length() > max.length()) {
				max = currentMax;
				

			}
		}

		System.out.println("Longest Non-repeated subsequence: " + max);

	}

}
