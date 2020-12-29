package cn.oracle.tutorials.generics;



class Alpa{}

class Beta extends Alpa{}

class Gama extends Alpa{}

class SuperList<E>{
	public void echo() {
		System.out.println("echo");
	}
}

class SubList<E> extends SuperList<E> {
	public void echo() {
		System.out.println("echo");
	}
}

public class GenericInheritance {
	public static void main(String[] args) {
		
		SubList<Alpa> subList1 = new SubList();
		SubList<Beta> subList2 = new SubList<>();
		print1(subList1);
		print2(subList2);
	}
	
	
	public static void print1(SubList<Alpa> subList) {
		subList.echo();
	};
	
	public static <E> void print2(SuperList<E> superList) {
		superList.echo();
	};
}
