package cn.oracle.tutorials.interfacesAndinheritance;

public class Manager extends Employee{
	
	private double bonus;
	
	public Manager(String name, double salary, int year,int month,int day,double bonus) {
		super(name, salary,year,month,day);
		this.bonus = bonus;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	void print(String message) {
		System.out.println("sub class: " + message);
	}
	
	public double getSalary() {
		return super.getSalary() + bonus;
	}
	
}
