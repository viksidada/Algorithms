package com.ObjectSorting;

import java.util.Comparator;

public class Animals implements Comparator<Animals>{
	
	private String name;
	private int age;
	
	public Animals(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Animals() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Animals [name = " + name + ", age = " + age + "]";
	}

	/*	@Override
	public int compareTo(Animals animals) {
		
		return ((Integer)animals.getAge()).compareTo(this.age);
		return this.name.compareTo(animals.getName());
	}
*/
	@Override
	public int compare(Animals animal1, Animals animal2) {
		
		return animal1.getName().compareTo(animal2.getName());
	//	return Integer.compare(animal2.getAge(), animal1.getAge() );
	}
	
	

}
