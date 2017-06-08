package com.ObjectSorting;

public class LowerUpeerCase {
	
	public static void main(String[] args) {
		String name = "Vikas Srivastava";
		
		lowerCase(name);
		upperCase(name);
	}

	private static void upperCase(String name) {
		System.out.println(name.toUpperCase());
		
	}

	private static void lowerCase(String name) {
		System.out.println(name.toLowerCase());
		
	}

}
