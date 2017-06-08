package com.CodingPracticeQuestions;

import java.util.Arrays;

public class ArraysAddDemo {
	
	public static void main(String[] args) {
		int[] a1 = {1,3,5,7};
		int[] a2 = {2,4,6,8,10};
		int[] a3 = new int[a1.length + a2.length];
		
		System.arraycopy(a1, 0, a3, 0, a1.length);
		System.arraycopy(a2, 0,  a3, a1.length, a2.length);
		
		System.out.println(Arrays.toString(a3));
		
	}
	
	
	
	
	
	
	

}
