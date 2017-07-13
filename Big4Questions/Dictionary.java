package com.Big4Questions;

import java.util.LinkedHashMap;
import java.util.Map;

public class Dictionary {
	public static void main(String[] args) {
		String sentence = "The rain in spain falls mainly in the plain";
		
		Map<String, Integer> myMap = new LinkedHashMap<String, Integer>();
		
		String[] array = sentence.split("");
		
		for (String x : array) {
			if (x.equals(" ")) {
				continue;
			}
			
			Integer n = myMap.get(x);
			if (n == null) {
				n = 1;
			} else n++;
			
			myMap.put(x, n);
		}
		
		System.out.println(myMap);
	}

}
