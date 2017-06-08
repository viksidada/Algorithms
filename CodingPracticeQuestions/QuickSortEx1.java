package com.CodingPracticeQuestions;

import java.util.Arrays;

public class QuickSortEx1 {
	
	public static void Quicksort(String[] array, int left, int right) {
		int index = partition(array, left, right);
		
		if (left < index - 1) {
			Quicksort(array, left, index-1);
		}
		
		if (right > index) {
			Quicksort(array, index, right);
		}
	}
	
	public static int partition(String[] array, int left, int right) {
	   String pivot = array[(left+right) / 2];
	   
	   while (left <= right) {
		   while (array[left].compareToIgnoreCase(pivot) < 0) left++;
		   while (array[right].compareToIgnoreCase(pivot) > 0) right--;
		   
		   if (left <= right) {
			  String temp = array[left];
			   array[left] = array[right];
			   array[right] = temp;
			   
			   left++;
			   right--;
		   }
	   }
	   
	   return left;
	
	}

	public static void main(String[] args) {
		String[] numbers = {"a", "z", "y", "x", "w", "b", "o"};
		System.out.println("Before Sorting: " + Arrays.toString(numbers));
		
		System.out.println();
		Quicksort(numbers, 0, numbers.length-1);
		System.out.println(("After Sorting: " + Arrays.toString(numbers)));

	}

}
