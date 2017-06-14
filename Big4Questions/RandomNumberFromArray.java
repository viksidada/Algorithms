package com.Big4Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumberFromArray {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(2);
		numbers.add(4);
		numbers.add(6);
		numbers.add(10);
		numbers.add(4);
		numbers.add(4);
		 

	add(3, numbers);
	delete(4, numbers);
	System.out.println("Random number: " + random(numbers));

	}
	
	public static void add(int n, List<Integer> array) {
		System.out.println("The Add Method");
		System.out.println("Old ArrayList " + array);
		array.add(n);
		System.out.println("New ArrayList " + array);
	}
	
	public static void delete(int n, List<Integer> array) {
		System.out.println();
		System.out.println("The Delete Method");
		System.out.println("Old ArrayList " + array);
		int counter = 0;
		
		while(array.contains(n) == true) {
			int index = array.indexOf(n);
			array.remove(index);
			counter++;
		}
		
		if (counter == 0) {
			System.out.println(n + " is not present");
		} else System.out.println(n + " deleted");
		
		System.out.println("New ArrayList " + array);
		System.out.println();
	}
	
	public static Integer random(List<Integer> number) {
		Random random = new Random();
		int index = random.nextInt(number.size()-1 - 0 + 1) + 0;
		return number.get(index);
	}
	
	

}
