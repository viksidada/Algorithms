package com.CodingPracticeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CommonSuffix {

	public static void main(String[] args) {
		String a = "nation";
		String b = "mention";
		
		int l1 = a.length();
		int l2 = b.length();
		
		String suffix ="";
		String reverse1 = "";
		String reverse2 = "";
		
		for (int i = l1-1; i >= 0; i--) {
			reverse1 += a.charAt(i);
		}
		
		for (int j = l2-1; j >= 0; j--) {
			reverse2 += b.charAt(j);
		}
		
		System.out.println(reverse1 + " " + reverse2);
		
		int limit = 0;
		
		if (l1 > l2) {
			limit = l2;
		} else if (l1 < l2) {
			limit = l1;
		} else limit = l1;
		
		for (int i = 0; i < limit; i++) {
			if (reverse1.charAt(i) == reverse2.charAt(i)) {
				suffix += reverse1.charAt(i);
			} else break;
		}
		
		System.out.println(suffix);
		
		String result = "";
		for (int x = suffix.length() -1; x >= 0; x--) {
			result += suffix.charAt(x);
		}
		
		System.out.println("Common Suffix is: " + result);
		
 }
}
