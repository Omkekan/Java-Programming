/*
 * Car.java
 * ---------------------------------------------------------------
 * Concepts used:
 *  - Composition / HAS-A relationship (Car has an Engine and a MusicSystem)
 *  - Objects as instance variables (reference-type fields)
 *  - Object graph: Car -> Engine, Car -> MusicSystem
 *  - Constructor overloading (default + fully parameterised)
 *  - Creating a dependent object inside a constructor (new Engine())
 *  - Leaving a field unassigned -> it stays null (MusicSystem in default Car)
 *  - Dependency injection through the constructor (objects passed in)
 *  - Encapsulation with getters/setters
 */
public class Car {
	private String description;
	private int onRoadPrice;
	private Engine currentEngine;              // HAS-A Engine
	private MusicSystem currentMusicSystem;    // HAS-A MusicSystem (optional)
	
	// Basic car: gets a default engine but NO music system (stays null)
	public Car() {
		description = "hyundai I20";
		onRoadPrice = 1200000;
		currentEngine = new Engine();
		//currentMusicSystem = new MusicSystem();
	}

	// Premium car: Engine and MusicSystem objects are supplied by the caller
	public Car(String description, int onRoadPrice, Engine currentEngine, MusicSystem currentMusicSystem) {
		super();
		this.description = description;
		this.onRoadPrice = onRoadPrice;
		this.currentEngine = currentEngine;
		this.currentMusicSystem = currentMusicSystem;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getOnRoadPrice() {
		return onRoadPrice;
	}

	public void setOnRoadPrice(int onRoadPrice) {
		this.onRoadPrice = onRoadPrice;
	}

	public Engine getCurrentEngine() {
		return currentEngine;
	}

	public void setCurrentEngine(Engine currentEngine) {
		this.currentEngine = currentEngine;
	}

	public MusicSystem getCurrentMusicSystem() {
		return currentMusicSystem;
	}

	public void setCurrentMusicSystem(MusicSystem currentMusicSystem) {
		this.currentMusicSystem = currentMusicSystem;
	}
	
	

}
