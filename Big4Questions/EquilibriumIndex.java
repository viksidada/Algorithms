package com.Big4Questions;

public class EquilibriumIndex {
	public static void main(String[] args) {

		int[] array = { -1, 3, -4, 5, 1, -6, 2, 1 };

		int equiIndex = solution(array);
		System.out.println("The eqiuilibrium index: " + equiIndex);
	}

	public static int solution(int[] array) {

		int leftMax = 0;
		int rightMax = 0;
		boolean found = false;
		int index = 0;

		for (int i = 1; i < array.length; i++) {
			leftMax += array[i - 1];
			for (int j = i + 1; j < array.length; j++) {

				rightMax += array[j];
			}

			if (leftMax == rightMax) {
				found = true;
				index = i;
				break;
			} else {
				rightMax = 0;
			}
		}

		if (found) {
			return index;
		} else
			return -1;
	}

}
