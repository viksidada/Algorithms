package com.ObjectSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayRange {

	public static void main(String[] args) {
		int[] range1 = { 100, 1 };
		int[] range2 = { 50, 250 };

		// System.out.println(range(range1, range2));

		System.out.println(Arrays.toString(range(range1, range2)));
		System.out.println("\n");
		
	}

	public static int[] range(int[] range1, int[] range2) {

		Arrays.sort(range1);
		Arrays.sort(range2);

		int[] range = null;

		if (range1[1] > range2[0]) {
			range = new int[2];
			range[0] = range2[0];
			range[1] = range1[1];

		} else if (range1[1] == range2[0]) {
			range = new int[1];
			range[0] = range1[1];

		} else if (range1[1] < range2[0]) {
			return null;
		}

		return range;

	}

}
