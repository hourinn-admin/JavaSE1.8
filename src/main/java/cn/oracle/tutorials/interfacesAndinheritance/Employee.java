package cn.oracle.tutorials.interfacesAndinheritance;

import java.time.LocalDate;

public class Employee {
	private String name;
	
	private double salary;
	
	private LocalDate hireDayDay;

	public Employee(String name, double salary, int year,int month,int day) {
		this.name = name;
		this.salary = salary;
		this.hireDayDay = LocalDate.of(year, month, day);
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public LocalDate getHireDayDay() {
		return hireDayDay;
	}
	
	public Employee getBuddy() {
		return new Employee("My Buddy", 0, 2000, 2, 2);
	}
}
