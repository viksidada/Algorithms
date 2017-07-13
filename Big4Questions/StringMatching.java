package com.Big4Questions;

public class StringMatching {
	public static void main(String[] args) {
		String word1 = "abppplee";
		String word2 = "abled";
		
		boolean found = false;
		for (int i = 0; i < word2.length(); i++) {
			 found = false;
	   inner:for (int j = 0; j < word1.length(); j++) {
				if (word2.charAt(i) == word1.charAt(j)) {
					found = true;
					break inner;
				}
			}
		}
		
		if (found) {
			System.out.println(true);
		} else System.out.println(false);
	}

}
