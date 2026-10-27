/*
 * Engine.java
 * ---------------------------------------------------------------
 * Concepts used:
 *  - Encapsulation (private fields, public getters/setters)
 *  - Constructor overloading (no-arg and 2-arg constructors)
 *  - Default values set inside the no-arg constructor
 *  - 'this' keyword to refer to instance variables
 *  - Acts as a "part" class in a HAS-A relationship (used by Car)
 */
public class Engine {
	private String power;
	private String fuel;
	
	// Default engine: 1200 CC petrol
	public Engine() {
		power ="1200 CC";
		fuel = "petrol";
	}
	
	// Custom engine
	public Engine(String power, String fuel) {
		super();
		this.power = power;
		this.fuel = fuel;
	}
	
	public String getPower() {
		return power;
	}
	
	public void setPower(String power) {
		this.power = power;
	}
	
	public String getFuel() {
		return fuel;
	}
	
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	
	
}
