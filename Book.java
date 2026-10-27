/*
 * Book.java
 * ---------------------------------------------------------------
 * Concepts used:
 *  - Encapsulation (private fields + public getters/setters)
 *  - Constructor overloading: 1 no-arg + 3 parameterised constructors
 *    that differ only in the ORDER of parameter types
 *  - Default constructor assigning default values to fields
 *  - 'this' keyword to distinguish fields from parameters
 *  - super() - explicit call to the parent (Object) constructor;
 *    it is optional, the compiler adds it automatically
 *  - Primitive (int, float) and reference (String) fields
 */
public class Book {
	private String title;
	private String author;
	private int pageCount;
	private float price;
	
	// No-arg constructor: creates a Book with default values
	public Book() {
		title = "Wise and otherWise";
		author = "Om kekan";
		pageCount = 2021;
		price = 1234.00f;
	}
	
	// Parameterised constructor #1: (String, String, int, float)
	public Book(String title, String author, int pageCount, float price) {
//		super();
		this.title = title;
		this.author = author;
		this.pageCount = pageCount;
		this.price = price;
	}

	// Overloaded constructor #2: (String, float, String, int) - different type order
	public Book(String author, float price, String title, int pageCount) {
		super();
		this.author = author;
		this.price = price;
		this.title = title;
		this.pageCount = pageCount;
	}
	

	// Overloaded constructor #3: (float, String, String, int) - different type order
	public Book(float price, String title, String author, int pageCount) {
		super();
		this.price = price;
		this.title = title;
		this.author = author;
		this.pageCount = pageCount;
	}

	// ----- Getters and setters -----
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
