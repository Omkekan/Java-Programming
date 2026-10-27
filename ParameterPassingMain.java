/*
 * ParameterPassingMain.java
 * ---------------------------------------------------------------
 * Concepts used:
 *  - Java is ALWAYS pass-by-value
 *  - Primitive parameter: a COPY of the value is passed, so the
 *    original variable does not change (index stays 7)
 *  - Object parameter: a COPY of the REFERENCE is passed, so both
 *    references point to the same object -> changes made through
 *    the method ARE visible to the caller
 *  - private static helper methods
 *  - Using a setter inside a method to modify an object
 *
 * Expected output:
 *   Index before change: 7
 *   Index after change 7
 *   Book title befor change: Wise and otherWise
 *   Book title after change: Rise and Showre
 */
public class ParameterPassingMain {
	
	// Only changes the local copy of idx
	private static void changeIndex(int idx) {idx = 10;}
	
	// Changes the actual Book object that the caller also references
	private static void changeBookTitle(Book currentBook) {currentBook.setTitle("Rise and Showre");}
	
	public static void main(String[] args) {
		int index = 7;
		System.out.println("Index before change: "+ index);
		changeIndex(index);
		System.out.println("Index after change "+ index);
		System.out.println("===========================");
		Book myBook = new Book();
		System.out.println("Book title befor change: "+ myBook.getTitle());
		changeBookTitle(myBook);
		System.out.println("Book title after change: "+ myBook.getTitle());
		System.out.println("===========================");
		

	}

}
