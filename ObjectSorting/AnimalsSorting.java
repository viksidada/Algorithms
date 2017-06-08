package com.ObjectSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnimalsSorting {

	public static void main(String[] args) {
		
		List<Animals> newList = new ArrayList<Animals>();
		
		Animals animals1 = new Animals("ape", 20);
		newList.add(animals1);
		
		Animals animals2 = new Animals("zebra", 10);
		newList.add(animals2);
		
		Animals animals3 = new Animals("buffalo", 30);
		newList.add(animals3);
		
		for (Animals x : newList) {
			System.out.println(x);
		}
		
		Collections.sort(newList, new Animals());
		
		System.out.println("\t" + "After Sorting" + "\n");
		
		for (Animals x : newList) {
			System.out.println(x);
		}
		
		
	}

}
