package cn.oracle.tutorials.generics;

class A { /* ... */ 
	static void print() {
		System.out.println("class A");
	}
}
class B { /* ... */ 
	static void print() {
		System.out.println("class B");
	}
}
interface C { /* ... */ }
interface D { /* ... */ }

class E extends B implements C,D{
	
}

public class Box<T extends A>{
	private T t;
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	
	public <U extends B&C&D> void inspect(U u) {
		t.print();
		System.out.println("T:" + t.getClass().getName());
		System.out.println("U:" + u.getClass().getName());
	}
	
	public static void main(String[] args) {
		Box<A> box = new Box<>();
		box.setT(new A());
		
		box.inspect(new E());
	}
	
}
