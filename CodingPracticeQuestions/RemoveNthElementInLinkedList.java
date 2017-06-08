package com.CodingPracticeQuestions;

import java.util.LinkedList;
import java.util.List;

public class RemoveNthElementInLinkedList {

	public static void main(String[] args) {
		
		List<Integer> linkedList = new LinkedList<Integer>();
		
		linkedList.add(10);
		linkedList.add(90);
		linkedList.add(60);
		linkedList.add(20);
		linkedList.add(10);
		linkedList.add(50);
		
		System.out.println("Original LinkedLIst: " + linkedList);
		
		remove(linkedList, linkedList.size()-2);
		
		System.out.println("New Linked LIst: " + linkedList);
		
		
		

	}
	
	public static void remove(List list, int index) {
		
		if (list.size() == 0) {
			return;
		}
		
		if (list.get(index) != null) {
			list.remove(index);
		}
		
	}

}
