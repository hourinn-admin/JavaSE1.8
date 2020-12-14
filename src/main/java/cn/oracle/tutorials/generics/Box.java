package cn.oracle.tutorials.generics;

public class Box<T> {
	private T object;
	public T getObject() {
		return object;
	}
	public void setObject(T object) {
		this.object = object;
	}
	
	public static void main(String[] args) {
		Box<String> box = new Box<>();
		box.setObject("hello");
		String str = box.getObject();
	}
}
