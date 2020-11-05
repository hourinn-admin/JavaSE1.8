package cn.corejavavolume11.inheritance.sub;

import cn.corejavavolume11.inheritance.Employee;

public class Manager extends Employee{
	
	private double bonus;
	
	public Manager(String name, double salary, int year,int month,int day,double bonus) {
		System.out.println("manager object :" +this);
		super.salary = salary;
		this.bonus = bonus;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double getSalary() {
		return this.salary + bonus;
	}
}
