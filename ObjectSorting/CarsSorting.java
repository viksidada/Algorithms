package com.ObjectSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CarsSorting {
	public static void main(String[] args) {
		
		List<Cars> newCars = new ArrayList<Cars>();
		
		Cars cars1 = new Cars("Mercedez", "sedan", 250000, 2017);
		newCars.add(cars1);
		
		Cars cars2 = new Cars ("BMW", "coupe", 45000, 2016);
		newCars.add(cars2);		
	
		Cars cars3 = new Cars("Audi", "sports car", 65000, 2015);
		newCars.add(cars3);
		
		Cars cars4 = new Cars("Toyota", "sedan", 26000, 2012);
		newCars.add(cars4);		
		
		
		for (Cars x : newCars) {
			System.out.println(x);
		}
		
		Collections.sort(newCars);
		
		System.out.println("\t" + "After Sorting " + "\n");
		
		for (Cars x : newCars) {
			System.out.println(x);
		}
	}

}
