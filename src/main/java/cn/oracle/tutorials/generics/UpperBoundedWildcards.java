package cn.oracle.tutorials.generics;

import java.util.ArrayList;
import java.util.List;

abstract class  MyNumber{
	public abstract int intValue();
	
	public abstract double doubleValue();
	
	public void print() {
		System.out.println("MyNumber Class");
	}
}

class MyInteger extends MyNumber{
	
	private int value;
	
	public MyInteger(int value) {this.value = value;}
	
	public int intValue() { return value;}

	public double doubleValue() { return (double)value;}
	
	public void print() {
		System.out.println("MyInteger Class");
	}
	
}

class MyDouble extends MyNumber{
	
	private double value;
	
	public MyDouble(double value) {this.value = value;}
	
	public int intValue() { return (int)value;}

	public double doubleValue() { return value;}
}


public class UpperBoundedWildcards {
	
	public static void main(String[] args) {
		List<MyInteger> intList = new ArrayList<>();
		intList.add(new MyInteger(1));
		intList.add(new MyInteger(2));
		intList.add(new MyInteger(3));
		List<MyDouble> doubleList =new ArrayList<>();
		doubleList.add(new MyDouble(1.5));
		doubleList.add(new MyDouble(2.5));
		doubleList.add(new MyDouble(3.5));
		
		System.out.println(sumOfList(intList));
		System.out.println(sumOfList(doubleList));
	}
	
	public static double sumOfList(List<? extends MyNumber> list) {
		double sum = 0.0;
		for (MyNumber myNumber : list) {
			sum += myNumber.doubleValue();
			myNumber.print();
		}
		return sum;
	}
	
}
