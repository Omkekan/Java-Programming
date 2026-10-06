import java.util.Scanner;

public class DistinctElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        if (n < 2) {
            System.out.println("-1");
            sc.close();
            return;
        }
        
        // Step 1: Find the maximum element in the array
        int largest = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        
        // Step 2: Find the maximum element that is strictly less than 'largest'
        int secondLargest = Integer.MIN_VALUE;
        boolean found = false;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] < largest) { // Must be smaller than the largest
                if (!found || arr[i] > secondLargest) {
                    secondLargest = arr[i];
                    found = true; // We found at least one valid second largest candidate
                }
            }
        }
        
        // Print the result based on whether we found a distinct second largest element
        if (found) {
            System.out.println("Second Largest = " + secondLargest);
        } else {
            System.out.println("-1");
        }
        
        sc.close();
    }
}
