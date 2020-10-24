package cn.oracle.tutorials.classesAndObjects.moreOnClasses;


class BedAndBreakfast {
	
	static {
		System.out.println("If the  class variables initialization requires some logic,such as  error handling ,static initialization blocks can do it.");
		capacity = 10;
	}
	
	{
		System.out.println("The Java compiler copies initializer blocks into every constructor");
		full = true;
	}

    // initialize to 10
    public static int capacity;

    // initialize to false
    private boolean full;
    
    private String instanceVariable = initializeInstanceVariable();
    
    protected final String initializeInstanceVariable() {
    	return "nal method for initializing an instance variable";
    }
    
    
    public BedAndBreakfast() {
    	
    }
    
    public BedAndBreakfast(boolean full) {
    	this.full = full;
    }
    
    public boolean getFull() {
		// TODO Auto-generated method stub
    	return this.full;
	}
    
    public String getInstanceVariable() {
    	return this.instanceVariable;
    }
}

public class InitializingFields {

	public static void main(String[] args) {
		
		BedAndBreakfast aaAndBreakfast = new BedAndBreakfast();
		System.out.println(aaAndBreakfast.getFull());
		
		BedAndBreakfast aaAndBreakfast2 = new BedAndBreakfast(false);
		System.out.println(aaAndBreakfast2.getFull());
		
		
		BedAndBreakfast aaAndBreakfast3 = new BedAndBreakfast();
		System.out.println(aaAndBreakfast3.getInstanceVariable());
		
		System.out.println(BedAndBreakfast.capacity);
		
		
	}

}
