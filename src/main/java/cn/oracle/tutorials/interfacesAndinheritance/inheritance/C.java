package cn.oracle.tutorials.interfacesAndinheritance.inheritance;

public class C extends A implements B{
	
	String message = "messageC";
	
	public void printMessage(){
		
		
		System.out.println("print C message " + message);
	}
	
	public static void testClassMethod() {
		System.out.println("this is a class method from C");
	}

	public static void main(String[] args) {
		C c = new C();
		c.testClassMethod();
		A a = c;
		
		A a1 = new A();
		
		B c1 = new C();
		c1.printMessage();
		
		//a1.printMessage();
		
		System.out.println(a.message);
		
		//a.printMessage();
		
		A.testClassMethod();
		
	}
}
