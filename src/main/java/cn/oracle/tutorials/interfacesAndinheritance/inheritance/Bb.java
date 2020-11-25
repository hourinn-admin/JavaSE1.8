package cn.oracle.tutorials.interfacesAndinheritance.inheritance;

public interface Bb extends B{
	public default void  printMessage(){
		System.out.println("message from Bb");
	}
	
	public default void testConflictMethod() {
		System.out.println("conflict method in b");
	}
}
