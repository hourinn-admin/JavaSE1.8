package cn.oracle.tutorials.interfacesAndinheritance.inheritance;

public interface Bc extends B{
	public default void testConflictMethod() {
		System.out.println("conflict method in c");
	}
}
