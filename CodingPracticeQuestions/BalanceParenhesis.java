package com.CodingPracticeQuestions;

//This program thatkes a String of unbalanced Parenthesis and returns them after balencing it.

public class BalanceParenhesis {

	public static void main(String[] args) {
		String parenthesis = "((((((";
		System.out.println("Original String length: " + parenthesis.length());

		System.out.println("Balanced String: " + BalencedParenthesis(parenthesis));

	}

	public static String BalencedParenthesis(String string) {

		int open = 0;
		int closed = 0;

		if (string.length() == 0) {
			return "Empty String";
		}

		for (int i = 0; i < string.length(); i++) {
			String value = String.valueOf(string.charAt(i));
			if (value.equals("(")) {
				open++;
			} else if (value.equals(")")) {
				closed--;
			}

		}

		int sum = open + closed;

		if (sum == 0) {
			return string;
		} else if (sum > 0) {
			while (sum != 0) {
				string += ")";
				sum--;
			}

		} else if (sum < 0) {
			while (sum != 0) {
				string += "(";
				sum++;
			}

		}

		return string;

	}

}
