package com.CodingPracticeQuestions;

import java.util.Arrays;

public class NumberRange {

	public static void main(String[] args) {
		int[] first = {0, 100};
		int[] second = {50, 0};
		
		int[] result = null;
		
		Arrays.sort(first);
		Arrays.sort(second);
		
		if (first[1] > second[0]) {
			result = new int[2];
			result[0] = second[0];
			result[1] = first[1];
		} else if (first[1] < second[0]) {
			result = null;
			
		}
		
		System.out.println(Arrays.toString(result));

	}

}
