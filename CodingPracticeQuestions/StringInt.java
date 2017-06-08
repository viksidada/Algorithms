package com.CodingPracticeQuestions;

import java.util.Arrays;

public class StringInt {
	public static void main(String[] args) {
		int[] number = null;
		
		if ( 2 < 1) {
			number = new int[2];
			number [0] = 1;
			number[1] = 2;
		} else if ( 4 < 9) {
			number = null;
		}
		
		System.out.println(Arrays.toString(number));
	}

}
