package com.CodingPracticeQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MedianOfTwoArrays {
	
	public static void main(String[] args) {
		int[] array1 = {1, 2};
		int[] array2 = {3,4,5,6};
		int[] array3 = new int[array1.length + array2.length];
		
		System.arraycopy(array2, 0, array3, 0, array2.length);
		System.arraycopy(array1, 0, array3, array2.length, array1.length);
		Arrays.sort(array3);
		
		System.out.println(Arrays.toString(array3));
		
		int middleElement = array3.length / 2;
		float median = 0;
		
		if ( array3.length % 2 == 0) {
			median = ((float)(array3[middleElement] + array3[middleElement-1]) / 2);
		} else median = array3[middleElement];
		
		System.out.println("Median is: " + median);
		
	//	System.out.println(median(array1, array2));
	}

	public static float median(int[] array1, int[] array2) {
				
		float median = 0 ;
		
		if (array1.length == 0 || array2.length == 0) {
			System.out.println("One of the arrays is emplty");
			return median;
		}
		
		median = ((float)(array1[array1.length - 1] + array2[0])) / 2;
		
		return median;
	}

}
