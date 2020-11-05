package cn.corejavavolume11.inheritance;

import cn.corejavavolume11.inheritance.sub.Manager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager manager = new Manager("tom", 6000, 2016, 9, 13, 500);
		
		Employee employee = new Employee("jim", 5000, 2020, 1, 5);
		
		manager.printSalary();
		
		System.out.println(employee.getSalary());
		
		System.out.println(manager.getSalary());
		
		System.out.println(manager.getHireDayDay());
		
		
		Manager[] managers = new Manager[10];
		
		Employee[] employees = managers;
		
		employees[0] = new Employee("smith", 5000,2020,5,20);
		
		managers[0].setBonus(2000);
	}
	
}
