package cn.oracle.tutorials.generics;

interface Pair<K, V> {
	public K getKey();
	public V getValue();
}

public class OrderPair<K,V> implements Pair<K, V>{
	
	private K key;
	private V value;
	
	public OrderPair() {};
	
	public OrderPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

	@Override
	public K getKey() {return key;}

	@Override
	public V getValue() {return value;}
	
	public static void main(String[] args) {
		Pair<String,Integer> pairA = new OrderPair<>();
		Pair<String,String> pairB = new OrderPair<>();
		Pair<String,Box<Integer>> pairC = new OrderPair<>();
	}
}