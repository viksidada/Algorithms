package com.Big4Questions;

import java.util.Set;
import java.util.TreeSet;

public class ArrayZero {

	public static void main(String[] args) {
		int[][] myArray = new int[4][4];
		
		for (int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if(i == j) {
					myArray[i][i] = 0;
				} else myArray[i][j] = i+j+2;
				System.out.print(myArray[i][j] + " ");
			}
			System.out.println("\n");
		}
		
		System.out.println("Converted Array: ");
		System.out.println("\n");
		
		int[][] finalArray = (convertedArray(myArray));
		
		for (int x = 0; x < finalArray.length; x++) {
			for (int y = 0; y < finalArray.length; y++) {
				System.out.print(finalArray[x][y] + " ");
			}
			System.out.println("\n");
		}

	}
	
	public static int[][] convertedArray(int[][] array) {
		int length = (array.length);
		Set<Integer> iset = new TreeSet<Integer>();
		Set<Integer> jset = new TreeSet<Integer>();
		int[][] resultArray = new int[length][length];
		
		for(int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				if (array[i][j] == 0) {
					if ((iset.contains(i)) && (jset.contains(j))) {
						continue;
					} else {
						for (int k = 0; k < length; k++) {
							resultArray[i][k] = 0;
							resultArray[k][j] = 0;
							iset.add(i);
							jset.add(j);
						}
					}
				} else {
					resultArray[i][j] = array[i][j];
				}
				
			}
		}
		return resultArray;
	}

}
