package cn.oracle.tutorials.interfacesAndinheritance.interfacefun;

public interface Comparable {
	
	/**
	 * compare two objects ,if larger than ,return 1;if equal to,return 0;if smaller than ,return -1
	 * @param o
	 * @return
	 */
	public abstract int compareTo(Comparable o);
	
}
