package com.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddNumbersInRange {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(oddNum(3,9)));

	}
	
	public static int[] oddNum(int l, int r) {
		
		int even = l % 2;
        int n;
        if (even == 0) {
            n = l+1;
        } else n = l;
        List<Integer> array = new ArrayList<Integer>();
        
        for (int i = n; i <= r; i += 2) {
            array.add(i);
    }
        int[] myArray = new int[array.size()];
        
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = array.get(i);
        }
        
        return myArray;
	}

}
