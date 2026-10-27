/*
 * Personmain.java
 * ---------------------------------------------------------------
 * Concepts used:
 *  - static initializer block in the main class (runs BEFORE main())
 *  - Execution order: class loading -> static block -> main()
 *  - Accessing static members through the class name (Person.personCount)
 *  - Static variable shared across all objects
 *  - Anonymous objects: new Person(); (created without storing a reference)
 *  - Creating objects in a for loop
 *  - Calling a static getter (Person.getPerson_Count())
 *
 * Expected output:
 *   class getting loaded
 *   Execution begins
 *   Person count: 3
 *   Person count: 5
 *   Person count: 15
 *   Person count: 15
 */
public class Personmain {
	
	static {
		
		System.out.println("class getting loaded");
	}

	public static void main(String[] args) {
		System.out.println("Execution begins");
		Person p1 = new Person();
		Person p2 = new Person("Tom", 22);
		Person p3 = new Person(22, "Jeery");
		
		System.out.println("Person count: "+ Person.personCount);   // 3
		new Person();              // anonymous objects still increase the count
		new Person("A", 10);
		System.out.println("Person count: "+ Person.personCount);   // 5
		
		for(int i = 1; i<= 10; i++) {
			new Person();
		}
		
		System.out.println("Person count: "+ Person.personCount);          // 15
		System.out.println("Person count: "+ Person.getPerson_Count());    // 15 (private static via getter)
	}

}
