package com.CodingPracticeQuestions;

public class MaxSumContinuousArray {

	public static void main(String[] args) {
		int[] numbers = { -2, -3, 4, -1, -2, 1, 5, -3 };

		int currentMax = 0;
		int maxTillNow = 0;

		for (int i = 0; i < numbers.length; i++) {

			currentMax += numbers[i];
			System.out.println("Sum: " + currentMax + " at i = " + i);

			if (currentMax < 0) {
				currentMax = 0;
			}

			if (maxTillNow < currentMax) {
				maxTillNow = currentMax;
			}
		}

		System.out.println("Maxium sum of a continuous subarray is: " + maxTillNow);

	}

}
