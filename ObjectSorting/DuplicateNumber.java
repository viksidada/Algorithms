package com.ObjectSorting;

import java.util.Arrays;
import java.util.List;

public class DuplicateNumber {

	public static void main(String[] args) {
		int[] numArray = { 7, 1, 3, 5, 2, 2, 6, 7 };
		String value = "";

		Arrays.sort(numArray);
		
		
		for (int i = 0; i < numArray.length - 1; i++) {
			if (numArray[i] == numArray[i + 1]) {
				value += numArray[i] + " ";

			}
		}
		
		System.out.println("Duplicate number: " + value);
	}

}
