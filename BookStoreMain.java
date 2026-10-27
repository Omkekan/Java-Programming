/*
 * BookStoreMain.java
 * ---------------------------------------------------------------
 * Concepts used:
 *  - Calling static methods using the class name (BookStore.getFirstBook())
 *  - Static block of BookStore is triggered on first use of the class
 *  - Receiving object references returned from methods
 *  - Null check before using an object (avoids NullPointerException)
 *  - if / else control flow
 */
public class BookStoreMain {

	public static void main(String[] args) {
		Book bookFirst = BookStore.getFirstBook();
		System.out.println(bookFirst.getTitle());
		
		Book bookLast = BookStore.getLastBook();
		System.out.println(bookLast.getTitle());
		
		// Try changing 1 to an invalid index (e.g. 5) to see the null handling
		Book currentBook = BookStore.getBookAt(1);
		if(currentBook != null)
			System.out.println(currentBook.getTitle());
		else
			System.out.println("Unable to find the Book");

	}

}
