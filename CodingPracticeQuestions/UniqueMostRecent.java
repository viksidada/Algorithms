package com.CodingPracticeQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class UniqueMostRecent {

	public static void main(String[] args) {
		
		List<String> arrayList = new ArrayList<String>();
		Set<String> linkedset = new LinkedHashSet<String>();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please Enter the number of URLs");
		int number = in.nextInt();
		
		for (int i = 0; i < number; i++) {
			System.out.println("Please enter the URL");
			String url = in.nextLine();
			arrayList.add(url);
		}
		
		Collections.reverse(arrayList);
		
		Set newSet = new LinkedHashSet(arrayList);
	    
	    System.out.println("Latest Unique Url's: " + newSet);
	    
	    
		

	}

}
