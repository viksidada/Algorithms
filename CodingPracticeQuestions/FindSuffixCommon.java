package com.CodingPracticeQuestions;

public class FindSuffixCommon {

	public static void main(String[] args) {
		String first = "islander";
		String second = "cavander";
		
		int l1 = first.length();
		int l2 = second.length();
		
		String reverse1  = "";
		String reverse2 = "";
		
		for (int i = l1-1; i >= 0; i--) {
			reverse1 += first.charAt(i);
		}
		
		for (int j = l2 - 1; j >= 0; j--) {
			reverse2 += second.charAt(j);
		}
		
		int limit = 0;
		
		if (l1 > l2) {
			limit = l2;
		} else if ( l1 <= l2) {
			limit = l1;
		} 
		
		String suffix = "";
		
		for (int x = 0; x < limit; x++) {
			if (reverse1.charAt(x) == reverse2.charAt(x)) {
				suffix += reverse1.charAt(x);
			} else break;
			
					
		}
		
String result = "";
		
		for (int y = suffix.length() -1 ; y >= 0; y--) {
			result += suffix.charAt(y);
		}
		
		System.out.println("Common suffix: " + result);

	}

}
