package com.CodingPracticeQuestions;

import java.util.Arrays;

public class MergeAndSortAgain {

	public static void main(String[] args) {
		int[] a = {9,7,5,3,1};
		int[] b = {12,10,8,6,4,2};
		int[] c = new int[a.length + b.length];
		
		System.arraycopy(a,  0, c,  0,  a.length);
		System.arraycopy(b,  0,  c, a.length, b.length);
		
		System.out.println("First Array: " + Arrays.toString(a));
		System.out.println();
		System.out.println("Second Array: " + Arrays.toString(b));
		System.out.println();
		System.out.println("Combined String: " + Arrays.toString(c));
		System.out.println();
		
		Quicksort(c, 0, c.length-1);
		System.out.println();
		
		System.out.println("AFter QuickSort: " + Arrays.toString(c));
	}
	
	public static void Quicksort(int[] array, int left, int right) {
		int index = partition( array, left, right);
		
		if ( left < index-1) {
			Quicksort(array, left, index-1);
		}
		
		if (right > index) {
			Quicksort(array, index, right);
		}
		
	}
	
	public static int partition(int[] array, int left, int right) {
		int pivot = array[(left+right) / 2];
		
		while (left <= right) {
			while (array[left] < pivot) left++;
			while (array[right] > pivot) right--;
			
			if (left <= right) {
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
