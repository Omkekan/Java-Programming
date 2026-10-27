/*
 * ArrayAsParameterMain.java
 * ---------------------------------------------------------------
 * Concepts used:
 *  - Passing an array to a method as a parameter (int[])
 *  - Returning an array from a method (double[])
 *  - Array initializer syntax: {65, 6, 8, 90, 91}
 *  - Enhanced for loop for reading, manual index for writing
 *  - Math.sqrt() from java.lang.Math
 *  - Implicit widening conversion (int -> double) when calling Math.sqrt
 *  - private static helper method
 *  - Arrays are objects: only the reference is passed (see ParameterPassingMain)
 */
public class ArrayAsParameterMain {
	
	// Takes an int array, returns a new double array holding the square roots
	private static double[] getSquareRoots(int[] allNumbers) {
		int size = allNumbers.length;
		double[] allSquareroots = new double[size];   // same size as the input
		int index = 0;
		for(int everyNumber : allNumbers) {
			double squareRoot = Math.sqrt(everyNumber);
			allSquareroots[index] = squareRoot;
			index++;
		}
		return allSquareroots;
	}
	
	public static void main(String[] args) {
		int[] numbers = {65, 6, 8, 90, 91};   // array literal
		
		double[] squareRoots = getSquareRoots(numbers);
		for(double squareRoot : squareRoots)
			System.out.println(squareRoot);
	}

}
