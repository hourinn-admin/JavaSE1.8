package cn.oracle.tutorials.classesAndObjects.nested_classes;

class OuterClass{
	
	private String fieldA = "Outter:fieldA";
	
	public void print() {
		System.out.println(this.fieldA);
	}
	
	class InnerClass{
		
		private String fieldA = "Inner:filedA";
		
		public void print() {
			System.out.println(fieldA);
			System.out.println(this.fieldA);
			System.out.println(OuterClass.this.fieldA);
		}
	}
}


public class InnerClassFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass outer = new OuterClass();
		
		OuterClass.InnerClass inner = outer.new InnerClass();
		
		inner.print();
	}

}
