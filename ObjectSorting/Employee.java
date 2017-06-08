package com.ObjectSorting;

public class Employee implements Comparable<Employee>{
	
	private String name;
	private String job;
	private int salary;
	private int yearOfJoining;
	
	public Employee(String name, String job, int salary, int yearOfJoining) {
		super();
		this.name = name;
		this.job = job;
		this.salary = salary;
		this.yearOfJoining = yearOfJoining;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getYearOfJoining() {
		return yearOfJoining;
	}
	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}
	@Override
	public int compareTo(Employee employee) {
		
		return ((Integer)this.yearOfJoining).compareTo(employee.getYearOfJoining());
		
//		return Integer.compare(this.salary, employee.getSalary());
		
//		int compareSalary = ((Employee) employee).getSalary();
//		return this.salary - compareSalary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", job=" + job + ", salary=" + salary + ", yearOfJoining=" + yearOfJoining
				+ "]";
	}
	
	

}
