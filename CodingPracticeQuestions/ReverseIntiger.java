package com.CodingPracticeQuestions;

public class ReverseIntiger {
	
	public static void main(String[] args) {
		int number = 123456;
		
		String num = String.valueOf(number);
		
		String result = "";
		
		for (int i = num.length()-1; i >= 0; i--) {
			result += num.charAt(i);
		}
		
		System.out.println("Original Integer: " + number);
		System.out.println();
		System.out.println("Reversed: " + Integer.parseInt(result));
		
	}
	

}
