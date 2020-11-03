package cn.oracle.tutorials.interfacesAndinheritance;

public interface Comparable {
	
	/**
	 * compare two objects ,if larger than ,return 1;if equal to,return 0;if smaller than ,return -1
	 * @param o
	 * @return
	 */
	int compareTo(Comparable o);
	
	default  void print(String message) {
		System.out.println(message);
	}
	
	static void echo() {
		System.out.println("echo");
	}
}
