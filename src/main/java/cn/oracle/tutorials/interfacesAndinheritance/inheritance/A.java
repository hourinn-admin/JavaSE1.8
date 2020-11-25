package cn.oracle.tutorials.interfacesAndinheritance.inheritance;

public class A {
	
	String message = "messageA";
	
	public  void  printMessage(){
		System.out.println("print A message " + message);
	}
	
	public static void testClassMethod() {
		System.out.println("this is a class method from A");
	}
	
}
