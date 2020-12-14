package cn.oracle.tutorials.generics;



public class Util<K,V> {
	
	//For static generic methods, the type parameter section must appear before the method's return type.
	public static <K,V> boolean compare1(Pair<K,V> p1,Pair<K,V> p2) {
		return p1.getKey() == p2.getKey() && p1.getValue() == p2.getValue();
	}
	
	public boolean compare2(Pair<K,V> p1,Pair<K,V> p2) {
		return p1.getKey() == p2.getKey() && p1.getValue() == p2.getValue();
	}
	
	public static void main(String[] args) {
		
		Pair<Integer, String> p1 = new OrderPair<>(1, "apple");
		Pair<Integer, String> p2 = new OrderPair<>(2, "pear");
		
		boolean same1 = Util.<Integer, String>compare1(p1, p2);
		
		boolean same2 = Util.compare1(p1, p2);
		
	}
}
