package com.ObjectSorting;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters {

	public static void main(String[] args) {
		String word = "aabra ka daabra";
		
		duplicates(word);
		frequency(word);
	}

	private static void frequency(String word) {
		Map<String, Integer> newMap = new LinkedHashMap<String, Integer>();
		
		if (word.length() == 0) {
			System.out.println("Empty String");
		} 
		
		for (int i = 0; i < word.length(); i++) {
				String value = String.valueOf(word.charAt(i));
				
				Integer n = newMap.get(value);
				
				if (n == null) {
					n = 1;
				} else n++;
				
				newMap.put(value, n);
			}
		
		System.out.println(newMap);
		
		
	}

	private static void duplicates(String word) {
		System.out.println("\t" + "This prints out the Duplicates");
		Set<String> newSet = new LinkedHashSet<String>();
		
		String[] strArray = word.split("");
		Arrays.sort(strArray);
		
		for ( int i = 0; i < strArray.length-1; i++) {
			if (strArray[i].equals(strArray[i+1])) {
				newSet.add(strArray[i]);
			}
		}
		
		System.out.println("\t" + newSet + "\n");
		
	}

}
