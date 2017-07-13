package com.Big4Questions;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] array1 = {2,4,6,8,10};
		int[] array2 = {1,3,5,7,9};
		int[] array = new int[array1.length+array2.length];
		
		System.arraycopy(array1, 0, array, 0, array1.length);
		System.arraycopy(array2,  0,  array,  array1.length, array2.length);
		System.out.println("Before Sorting: " + Arrays.toString(array));
		
		QuickSort(array, 0, array.length-1);
		System.out.println(Arrays.toString(array));

	}
	
	public static void QuickSort(int[] array, int left, int right) {
		int index = partion(array, left, right);
		
		if (left < index-1) {
			QuickSort(array, left, index-1);
		}
		
		if (right > index) {
			QuickSort(array, index, right);
		}
	}
	
	public static int partion(int[] array, int left, int right) {
		int pivot = array[(left+right) / 2];
		
		while (left <= right) {
			while (array[left] < pivot) left++;
			while (array[right] > pivot) right--;
			
			if (left <= right) {
				int temp = array[right];
				array[right] = array[left];
				array[left] = temp;
				
				left++;
				right--;
			}
			
		}
		
		return left;
	}
}
