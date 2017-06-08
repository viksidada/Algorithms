package com.CodingPracticeQuestions;

import java.util.LinkedList;
import java.util.List;

public class MidElementLinkedList {

	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<Integer>();

		for (int i = 0; i < 25; i++) {
			list.add(i);
		}
		
		System.out.println(list);

		System.out.println("Size of List: " + list.size());

		System.out.println("MId element of List: " + midelement(list));

	}

	private static Integer midelement(List<Integer> list) {

		int length = list.size();

		if (length == 0) {
			return null;
		}

		int mid = length / 2;

		return list.get(mid);

	}

}
