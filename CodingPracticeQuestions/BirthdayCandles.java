package com.algorithms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BirthdayCandles {

    static int birthdayCakeCandles(int n, int[] ar) {
        Arrays.sort(ar);
        int counter = 1;
        
        for (int i = ar.length-1; i > 0; i--) {
        	
        	if ((ar[i] != ar[i-1])) {
        		break;
        	}
        	counter++;
        }
        
        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
