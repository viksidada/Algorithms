package com.CodingPracticeQuestions;

import java.util.Scanner;

public class IntegerToBinary {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter an Integer");
		int number = in.nextInt();
		
		String binary = Integer.toBinaryString(number);
		
		System.out.println("Binary Representation of " + number + " is " +
		binary);
		
		int count = 0;
		
		for (int i = 0; i < binary.length(); i++) {
			char x = '1';
			if ( x == binary.charAt(i)) {
				count++;
			}
		}
		
		System.out.println("Number of '1' in " + binary + " is: " + count);

	}

}

