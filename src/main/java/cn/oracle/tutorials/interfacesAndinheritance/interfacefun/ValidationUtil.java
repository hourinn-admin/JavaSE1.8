package cn.oracle.tutorials.interfacesAndinheritance.interfacefun;

public class ValidationUtil {
	
	
	
	public Object findLargest(Object obj1,Object obj2) {
		//Interface Comparable can used as a reference data type ,the object assigned to it must be an instance of a class that implements the interface
		//casting obj1 to Comparable type
		Comparable o1 = (Comparable)obj1;
		Comparable o2 = (Comparable)obj2;
		
		if(o1.compareTo(o2) > 0) return o1;
		else if(o1.compareTo(o2) < 0)return o2;
		
		return null;
	}

}
