package com.CodingPracticeQuestions;

public class StringMatchingForGoogle {

	public static void main(String[] args) {
		String s = "abppplee";
		String  match = "mapple";
		
		int lengthm = match.length();
		int lengths = s.length();
		boolean found = false;
		
		for (int i = 0; i < lengthm; i++) {
			found = false;
			for(int j = i; j < lengths; j++) {
				if (match.charAt(i) == s.charAt(j)) {
					found = true;
					continue;
				} 
			}
			
			if (!found) {
				System.out.println("false");
				break;
			} 
		}
		
		if (found == true) {
			System.out.println("true");
		}
		
		System.out.println();
		String[] matching = {"able", "ale", "apple", "bale", "kangaroo", "apppee"};
		
		match("abppplee", matching );
		
		
	}
	
	public static void match(String original, String[] matching) {
		
		String currentBiggest = "";
		
		if (original.length() == 0 || matching.length == 0) {
			System.out.println("Please provide valid input");
			return;
		}
		
		int i = 0;
		
		while (i < matching.length) {
			String temp = matching[i];
			boolean found = false;
			
	outer:		for (int j = 0; j < temp.length(); j++) {
				found = false;
				for (int k = j; k < original.length(); k++) {
					if (temp.charAt(j) == original.charAt(k)) {
						found = true;
						continue;
					}
				}
				
				if (!found) {
					break outer;
				}
			}
			
			if (found == true) {
				if (currentBiggest.length() == 0) {
					currentBiggest = temp;
				} else if (currentBiggest.length() < temp.length()) {
					currentBiggest = temp;
				}
			}
			
			i++;
		}
		
		System.out.println("Longest Word which is a SubSequence is: " + currentBiggest);
		
	}

}
