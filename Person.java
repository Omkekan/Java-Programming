/*
 * Person.java
 * ---------------------------------------------------------------
 * Concepts used:
 *  - static variables (class-level, shared by ALL objects)
 *      * personCount  -> public static  (accessible directly, breaks encapsulation)
 *      * person_count -> private static (accessed via getPerson_Count(), better practice)
 *  - Instance variables (name, age) - separate for every object
 *  - static method (getPerson_Count) - called with the class name
 *  - Counting objects by incrementing a static variable in every constructor
 *  - Constructor overloading, including same types in different order
 *    ((String, int) and (int, String))
 *  - 'this' keyword and super()
 *  - Note: Java naming convention prefers camelCase (personCount),
 *    so 'person_count' / 'getPerson_Count' are non-standard names
 */
public class Person {
	private String name;
	private int age;
	public static int personCount;
	private static int person_count;
	
	// Static method: can only use static members directly
	public static int getPerson_Count() {
		return person_count;
	}
	
	public Person() {
		name = "mickey";
		age = 26;
		personCount++;      // every constructor updates the shared counters
		person_count++;
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		personCount++;
		person_count++;
	}

	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
		personCount++;
		person_count++;
	}
	
	
	
	// getters and setters implementations
	

}
