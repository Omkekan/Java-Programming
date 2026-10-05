import java.util.Scanner;

public class TwoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. Get dimensions for rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        
        // 2. Initialize the 2D array
        int[][] a = new int[rows][cols];
        
        // 3. Populate the 2D array using nested loops
        System.out.println("\nEnter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element for a[" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }
        
        
        // 5. Print rows in Ascending Order
        System.out.println("\nEntered elements (Rows Sorted in Ascending Order):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("a[" + i + "][" + j + "]: " + a[i][j] + "\t");
            }
            System.out.println(); 
        }
        
        
        sc.close();
    }
}
