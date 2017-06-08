package com.ObjectSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeSortingClass {

	public static void main(String[] args) {
		
		List<Employee> newList = new ArrayList<Employee>();
		
		Employee employee1 = new Employee("vikas", "developer", 100000, 2017);
		newList.add(employee1);
		
		Employee employee2 = new Employee("anna", "developer", 90000, 2010);
		newList.add(employee2);
		
		Employee employee3 = new Employee("samantha", "web developer", 150000, 2012);
		newList.add(employee3);
		
		Employee employee4 = new Employee("heather", "hot clerk", 80000, 2011);
		newList.add(employee4);
		
		for (Employee x : newList) {
			System.out.println(x);
		}
		
		Collections.sort(newList);
		
		System.out.println("\t" + "Sorted List: " + "\n");
		
		for (Employee x : newList) {
			System.out.println(x);
		}
		
		 
		 

	}

}
