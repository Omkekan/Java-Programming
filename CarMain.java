/*
 * CarMain.java
 * ---------------------------------------------------------------
 * Concepts used:
 *  - Object graph navigation (car -> engine -> power/fuel)
 *      * using explicit references (step by step)
 *      * using method chaining (car.getCurrentEngine().getFuel())
 *  - Null check on an optional part to avoid NullPointerException
 *  - Why explicit references help: you can test for null before using them
 *  - Building dependent objects first, then injecting them into a Car
 *  - Using the default vs the parameterised constructor
 */
public class CarMain {

	public static void main(String[] args) {
		// ---------- Basic car (no music system) ----------
		Car simpleCar;
		simpleCar = new Car();
		System.out.println(simpleCar.getDescription());
		
		// using explicit reference
		Engine simpleEngine = simpleCar.getCurrentEngine();
		String simplePower = simpleEngine.getPower();
		System.out.println(simplePower);
		
		//using object graph navigation
//		String simplePower = simpleCar.getCurrentEngine().getPower();
//		System.out.println(simplePower);
		
		MusicSystem ms = simpleCar.getCurrentMusicSystem();
		if(ms != null) {
			String soundEffect = ms.getSoundEffect();
			System.out.println(soundEffect);
		}else { // can be used only beacause of explicit reference
			System.out.println("This car dosen't have any music system");
		}
		
		System.out.println("\n=================\n");
		
		// ---------- Premium car (all parts supplied) ----------
		Car premiumCar;
		Engine premiumEngine = new Engine("5000CC", "Disel");
		MusicSystem premiumMusicSystem = new MusicSystem("Sony", "Dolby Atmos 10.0");
		premiumCar = new Car("Range Rover", 100000000, premiumEngine, premiumMusicSystem);	
		System.out.println(premiumCar.getDescription());
		System.out.println(premiumCar.getCurrentEngine().getFuel());   // chained navigation
//		System.out.println(premiumCar.getCurrentMusicSystem().getSoundEffect());
		
		
		
		MusicSystem ms1 = premiumCar.getCurrentMusicSystem();
		if(ms1 != null) {
			String soundEffect = ms1.getSoundEffect();
			System.out.println(soundEffect);
		}else {
			System.out.println("This car dosen't have any music system");
		}
		

	}

}
