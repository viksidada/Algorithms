package com.CodingPracticeQuestions;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedLIstAddSort {

	public static void main(String[] args) {
		List<Integer> list1 = new LinkedList<Integer>();
		list1.add(1);
		list1.add(3);
		list1.add(5);
		
		List<Integer> list2 = new LinkedList<Integer>();
		list2.add(2);
		list2.add(4);
		list2.add(6);
		
		List<Integer> list3 = new LinkedList<Integer>();
		
		list3.addAll(list1);
		list3.addAll(list2);
		
		System.out.println("List1: " + list1 + "  " + "List2: " + list2);
		System.out.println();
		System.out.println("BeforeSorting: " + list3);
		
		System.out.println();
		Collections.sort(list3);
		System.out.println("After Sorting: " + list3);
		
		for( Integer x : list3) {
			System.out.print(x + " : ");
			
		}
		
		System.out.println();
		
		System.out.println(list3.get(list3.size()-1));
		System.out.println();
		
		System.out.println(list3.contains(6));
		
		

	}

}
