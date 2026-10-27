/*
 * BookStore.java
 * ---------------------------------------------------------------
 * Concepts used:
 *  - Array of objects (Book[]) - elements are null until assigned
 *  - static variable shared by the whole class
 *  - static initializer block: runs once when the class is loaded,
 *    used here to pre-fill the array
 *  - static methods (called without creating a BookStore object)
 *  - Array length and calculating the last index (length - 1)
 *  - Bounds checking to avoid ArrayIndexOutOfBoundsException
 *  - Returning null to signal "not found"
 *  - Using different Book constructors to fill the array
 */
public class BookStore {
	private static Book[] allBooks = new Book[3];   // 3 slots, all null initially
	
	// Runs once, when BookStore is first loaded
	static {
		Book firstBook = new Book();                 // via explicit reference
		allBooks[0] = firstBook;
		
		allBooks[1] = new Book("Runs and Ruins", "Sunil Gavaskar", 225, 200.45f);  // direct creation
		allBooks[2] = new Book(450.5f, "Rear Window", "HitchCok", 240);            // other constructor order
	}
	
	public static Book getFirstBook() {
		return allBooks[0];
	}
	
	public static Book getLastBook() {
		int size = allBooks.length;
		int lastIndex = size - 1;
		return allBooks[lastIndex];
	}
	
	public static Book getBookAt(int index) {
		int size = allBooks.length;
		int lastIndex = size - 1;
		if(index < 0 || index > lastIndex)   // validate before accessing the array
			return null;
		return allBooks[index];
	}
	
	
}
