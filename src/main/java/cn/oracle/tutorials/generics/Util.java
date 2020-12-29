package cn.oracle.tutorials.generics;

public class Util<K,V> {
	
	//For static generic methods, the type parameter section must appear before the method's return type.
	public static <K,V> boolean compare(Pair<K,V> p1,Pair<K,V> p2) {
		return p1.getKey() == p2.getKey() && p1.getValue() == p2.getValue();
	}
	
	/* counts the number of elements in an array T[] that are greater than a specified element elem. */
	public static <T extends Comparable<T>> int countGreaterThan(T[] anAarry,T elem) {
		int count = 0;
		for (T t : anAarry)
			if(t.compareTo(elem) > 0)
				count++;
		return count;
	}
	
	public static void main(String[] args) {
		
		Pair<Integer, String> p1 = new OrderPair<>(1, "apple");
		Pair<Integer, String> p2 = new OrderPair<>(2, "pear");
		
		boolean same1 = Util.<Integer, String>compare(p1, p2);
		
		boolean same2 = Util.compare(p1, p2);
		
		String str = (String)null;
		
		System.out.println(str);
		
	}
}
