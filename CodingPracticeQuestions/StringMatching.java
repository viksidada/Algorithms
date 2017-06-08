package com.CodingPracticeQuestions;

public class StringMatching {

	public static void main(String[] args) {
		String a = "abppgpdlxcde";
		String b = "able";
		boolean value = false;;
		
		for (int i = 0; i < b.length(); i++) {
			value = false;
			for (int j = i; j < a.length(); j++) {
				if (b.charAt(i) == a.charAt(j)) {
					value = true;
				}
			}
			
			if (!value) {
				System.out.println("false");
				break;
			}
		}
		
		if(value) {
			System.out.println("true");
		}

	}

}
