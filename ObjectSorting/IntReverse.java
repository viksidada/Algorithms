package com.ObjectSorting;

public class IntReverse {
	
	public static void main(String[] args) {
		int number = 123456;
		
		String strNumber = Integer.toString(number);
		String[] strArray = strNumber.split("");
		String reverse = "";
		
		for ( int i = strArray.length-1; i >=0; i--) {
			reverse += strArray[i];
		}
		
		int reverseNumber = Integer.parseInt(reverse);
		
		System.out.println(reverseNumber);
		
		
		
	}

}
