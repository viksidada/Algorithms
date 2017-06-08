package com.CodingPracticeQuestions;

import java.util.Arrays;

public class MergeAndSort {
	
	public static void main(String[] args) {
		int[] first = {1,3,5,7};
		int[] second = {2,4,6,8,10};
		int[] third = new int[first.length + second.length];
		
		System.out.println("First array: " + Arrays.toString(first));
		System.out.println();
		System.out.println("Second array: " + Arrays.toString(second));
		
		System.arraycopy(first,  0,  third,  0,  first.length);
		System.arraycopy(second, 0, third, first.length, second.length);
		
		System.out.println("Final Array: " + Arrays.toString(third));
		
		Quicksort(third, 0, third.length-1);
		System.out.println();
		System.out.println("Sorted Array: " + Arrays.toString(third));
	}
	
	public static void Quicksort(int[] array, int left, int right) {
		int index = partion(array, left, right);
		
		if ( left < index-1) {
			Quicksort(array, left, index-1);
		} 
		
		if ( right > index) {
			Quicksort(array, index, right);
		}
	}
	
	public static int partion(int[] array, int left, int right) {
		
		int pivot = array[(left+right) / 2];
		
		while (left <= right) {
			while (array[left] < pivot) left++;
			while (array[right] > pivot) right--;
			
			if ( left <= right) {
				int temp = array[left];
				array[left] = array[right];
				array[right] = temp;
				
				left++;
				right--;
			}
		}
		return left;
	}

}
