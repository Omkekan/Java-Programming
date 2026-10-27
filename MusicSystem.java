/*
 * MusicSystem.java
 * ---------------------------------------------------------------
 * Concepts used:
 *  - Encapsulation (private fields, public getters/setters)
 *  - Constructor overloading (no-arg and 2-arg constructors)
 *  - Default values set inside the no-arg constructor
 *  - Acts as an OPTIONAL "part" class in a HAS-A relationship
 *    (a Car may or may not have a MusicSystem)
 */
public class MusicSystem {
	
	private String make;
	private String soundEffect;
	
	// Default music system: Panasonic stereo
	public MusicSystem() {
		make = "panasonic";
		soundEffect= "Stereo";
	}

	// Custom music system
	public MusicSystem(String make, String soundEffect) {
		super();
		this.make = make;
		this.soundEffect = soundEffect;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getSoundEffect() {
		return soundEffect;
	}

	public void setSoundEffect(String soundEffect) {
		this.soundEffect = soundEffect;
	}
	
	

}
