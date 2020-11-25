package cn.oracle.tutorials.interfacesAndinheritance.inheritance;

import cn.oracle.tutorials.interfacesAndinheritance.inheritance.sub.Bicycle;

public class MountainBike extends Bicycle{
	// the MountainBike subclass adds one field
    public int seatHeight;
    
    // the MountainBike subclass has one constructor
    public MountainBike(int startHeight,
                        int startCadence,
                        int startSpeed,
                        int startGear) {
    	super(startHeight,startCadence,startSpeed);
        seatHeight = startHeight;
    }   
        
    // the MountainBike subclass adds one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }   
    
   
    
	public String printDescription() {
		return super.printDescription() + "MountainBike [seatHeight=" + seatHeight + "]";
	}

	public static void main(String[] args) {
    	MountainBike mountainBike = new MountainBike(100, 5, 10, 1);
    	
    	System.out.println(mountainBike.gear);
    	
    	Bicycle bicycle = mountainBike;
    	
    	bicycle.setCadence(6);
    	bicycle.setGear(2);
    	
    	if(bicycle instanceof MountainBike) {
    		MountainBike mountainBike02 = (MountainBike)bicycle;  //cast
    		System.out.println(mountainBike02.toString());
    	}
	}
}	
