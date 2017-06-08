package com.ObjectSorting;

public class Cars implements Comparable<Cars>{
	
	private String brand;
	private String type;
	private int price;
	private int yearOfMake;
	
	public Cars(String brand, String type, int price, int yearOfMake) {
		super();
		this.brand = brand;
		this.type = type;
		this.price = price;
		this.yearOfMake = yearOfMake;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getYearOfMake() {
		return yearOfMake;
	}

	public void setYearOfMake(int yearOfMake) {
		this.yearOfMake = yearOfMake;
	}

	@Override
	public String toString() {
		return "Cars [brand = " + brand + ", type = " + type + ", price = " + price + ", yearOfMake = " + yearOfMake + "]";
	}

	@Override
	public int compareTo(Cars cars) {
		
		return ((Integer)cars.getYearOfMake()).compareTo(this.yearOfMake);
	}
	
	

}
