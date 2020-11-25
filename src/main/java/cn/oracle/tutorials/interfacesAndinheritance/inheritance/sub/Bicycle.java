package cn.oracle.tutorials.interfacesAndinheritance.inheritance.sub;

public class Bicycle {
	protected int cadence;
	protected int speed;
	protected int gear;
	
	public Bicycle() {}
	
	// the Bicycle class has one constructor
	public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
        
    // the Bicycle class has four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }
        
    public void setGear(int newValue) {
        gear = newValue;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }

	public String printDescription() {
		return "Bicycle [cadence=" + cadence + ", speed=" + speed + ", gear=" + gear + "]";
	}
}
