package com.CodingPracticeQuestions;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MinimumNodeElementInALinkedList {

	public static void main(String[] args) {
		
		List<Integer> linkedList = new LinkedList<Integer>();
		
		linkedList.add(10);
		linkedList.add(90);
		linkedList.add(60);
		linkedList.add(20);
		linkedList.add(10);
		linkedList.add(50);
		
        System.out.println("Original LinkedLIst: " + linkedList);
		
		System.out.println();
		
		int result = minimum(linkedList);
		
		System.out.println(result);
		
		

	}
	
	public static int minimum(List list) {
		
		Collections.sort(list);
		
		return (int) list.get(0);
		
	}

}
