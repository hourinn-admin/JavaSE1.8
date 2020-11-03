package cn.oracle.tutorials.interfacesAndinheritance;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager manager = new Manager("tom", 6000, 2016, 9, 13, 500);
		
		Employee employee = new Employee("jim", 8000, 2020, 1, 5);
		
		employee = manager;
		
		System.out.println(employee.getSalary());
		
		Manager[] managers = new Manager[10];
		
		Employee[] employees = managers;
		
		employees[0] = new Employee("smith", 5000,2020,5,20);
		
		managers[0].setBonus(2000);
	}
	
}
