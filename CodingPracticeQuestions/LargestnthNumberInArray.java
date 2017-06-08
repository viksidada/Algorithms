package com.CodingPracticeQuestions;

import java.util.Arrays;

public class LargestnthNumberInArray {

	public static void main(String[] args) {
		int[] numArray = {2,4,5,6,7,54,32,12,56,89,9,8,43,123,456,76};
		
		int result = nLargest(numArray, 5);
		System.out.println("nth Largest number: " + result);

	}

	private static int nLargest(int[] numArray, int i) {
		
		Arrays.sort(numArray);
		System.out.println("Sorted Array: " + Arrays.toString(numArray));
		
		return numArray[numArray.length-1-i];
		
		
		
	}

}
