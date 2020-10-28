package cn.oracle.tutorials.classesAndObjects.nested_classes;

import java.util.Iterator;

public class InnerClassFun2 {
	
	private int[] numArray = new int[15];
	
	
	public InnerClassFun2() {
		for(int i = 0;i<15;i++) {
			numArray[i] = i;
		}
	}
	
	public void printEven() {
		InnerClassFun2.EvenIterator iterator = this.new EvenIterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}
	
	class EvenIterator implements Iterator<Integer>{
		
		private int nextIndex = 0;
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return (nextIndex <= numArray.length -1);
		}

		@Override
		public Integer next() {
			// TODO Auto-generated method stub
			
			Integer output = Integer.parseInt(String.valueOf(numArray[nextIndex]));
			nextIndex += 2;
			return output;
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerClassFun2 inner = new InnerClassFun2();
		inner.printEven();
	}

}
