/*
 * BookMain.java
 * ---------------------------------------------------------------
 * Concepts used:
 *  - Creating objects with different constructors
 *      * no-arg constructor      -> default values
 *      * 4-arg constructor       -> custom values
 *  - Reading private data through getters
 *  - Formatting console output with String concatenation
 *  - Commented-out setter calls show the alternative way to set values
 *  - float literals (suffix 'f')
 */
public class BookMain {

	public static void main(String[] args) {
		Book bk = new Book();                                              // default constructor
		Book bk1 = new Book("Bochya", "Darshan Raut",12345 ,123456.098f);  // parameterised constructor
		
		// Alternative: set values using setters after creating the object
//		bk.setTitle("Wise and otherWise");
//		bk.setAuthor("Om Kekan");
//		bk.setPageCount(2000);
//		bk.setPrice(3000.00f);
		
		// Print the first book as a small table
		System.out.println("-------------------");
		System.out.println(bk.getTitle()+"|");
		System.out.println("-------------------");
		System.out.println(bk.getAuthor()+"          |");
		System.out.println("-------------------");
		System.out.println(bk.getPageCount()+"              |");
		System.out.println("-------------------");
		System.out.println(bk.getPrice()+"            |");
		System.out.println("-------------------");
		
		System.out.println();
		// Print the second book the same way
		System.out.println("-------------------");
		System.out.println(bk1.getTitle()+"            |");
		System.out.println("-------------------");
		System.out.println(bk1.getAuthor()+"      |");
		System.out.println("-------------------");
		System.out.println(bk1.getPageCount()+"             |");
		System.out.println("-------------------");
		System.out.println(bk1.getPrice()+"          |");
		System.out.println("-------------------");

	}

}
