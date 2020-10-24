package cn.oracle.tutorials.classesAndObjects.nested_classes;

import cn.oracle.tutorials.classesAndObjects.nested_classes.Outter.inner;

class Outter{
	public int num = 10;
	
	static class inner {
		void doSomething() {
			Outter outter = new Outter();
			System.out.println(outter.num);
		}
	}
}

interface OutInterface {
    void method_1();
    void method_2();
    class commonCode {
        public void print() {
            System.out.println("print something...");
        }
    }
}

class OutInterfaceImpl implements OutInterface{
	
	private OutInterface.commonCode commonCode = new commonCode();

	@Override
	public void method_1() {
		commonCode.print();
	}

	@Override
	public void method_2() {
		commonCode.print();
	}
	
}
    

public class StaticNestedClasses {

	public static void main(String[] args) {
		//access the static nested class
		Outter.inner inner = new inner();
		
		OutInterface oif = new OutInterfaceImpl();
		
		oif.method_1();
		oif.method_2();
		
		
		
	}

}
