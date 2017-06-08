package com.CodingPracticeQuestions;

import java.util.Arrays;

public class TwoArraySUm5 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,7,8,9,76,54};
		int[] b = {4,2,5,3,0,6,-2,-5,-4,-71,1};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] + b[j] == 5) {
					System.out.print("(" + a[i] + "," + b[j] + "), ");
				}
			}
		}
	}
	
	

}
