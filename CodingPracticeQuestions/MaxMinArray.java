package com.CodingPracticeQuestions;

public class MaxMinArray {

	public static void main(String[] args) {
		int[] array = {2,4,6,8,9,7,5,3,1};
		
		int max = 0;
		int min = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
			if (array[i] > max) {
				max = array[i];
			}
		}
		
		System.out.println("MAx: " + max + "  Min: " + min);

	}

}
