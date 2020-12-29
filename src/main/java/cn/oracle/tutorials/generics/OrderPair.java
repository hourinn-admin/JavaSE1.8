package cn.oracle.tutorials.generics;

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
		Pair<String,Integer> pairA = new OrderPair<String,Integer>();
		Pair<String,String> pairB = new OrderPair<>();
		Pair<String,Box<Integer>> pairC = new OrderPair<>();
	}
}