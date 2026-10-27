/*
 * SimpleArrayMain.java
 * ---------------------------------------------------------------
 * Concepts used:
 *  - Declaring and creating a primitive array (float[] with new float[5])
 *  - Fixed array size and the 'length' property
 *  - Zero-based indexing: valid indexes are 0 to length-1
 *  - Assigning values element by element
 *  - Traversing an array with
 *      * a classic for loop (index based)
 *      * an enhanced for-each loop (no index needed)
 */
public class SimpleArrayMain {

	public static void main(String[] args) {
		float[] temperatures = new float[5];   // 5 slots, default value 0.0f
		temperatures[0] = 34.5f;
		temperatures[1] = 35.5f;
		temperatures[2] = 36.5f;
		temperatures[3] = 37.5f;
		temperatures[4] = 38.5f;
		
		int size = temperatures.length;        // length is a field, not a method
		System.out.println("Size: "+size);
		
		// Classic for loop using the index
		for(int index = 0; index<size; index++) {
			float temp = temperatures[index];
			System.out.println(	temp);
		}
		System.out.println("=================");
		// Enhanced for loop (for-each)
		for(float tmp : temperatures)
			System.out.println(tmp);
	}

}
