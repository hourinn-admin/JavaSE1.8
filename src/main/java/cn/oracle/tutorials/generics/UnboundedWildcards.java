package cn.oracle.tutorials.generics;

import java.util.Arrays;
import java.util.List;

public class UnboundedWildcards {
	public static void main(String[] args) {
		
		List<Integer> li = Arrays.asList(1, 2, 3);
		List<String>  ls = Arrays.asList("one", "two", "three");
		
		//Because for any concrete type A, List<A> is a subtype of List<?>
		printList(li);
		System.out.println("");
		printList(ls);
		
		
	}
	
	public static void printList(List<?> list) {
		for (Object elem : list) {
			System.out.print(elem + " ");
		}
	}
}
