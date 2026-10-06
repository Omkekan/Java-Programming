import java.util.Scanner;

public class RotateArray {
   public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the size of the array
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        // Read the array elements
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Read the number of positions to rotate
        int k = sc.nextInt();
        
        if (n > 0) {
            // If k is larger than n, rotating k times is the same as rotating k % n times
            k = k % n;
            
            // Handle edge case if k is negative (though usually k is positive)
            if (k < 0) {
                k = k + n;
            }

            // Step 1: Reverse the entire array
            reverse(arr, 0, n - 1);
            
            // Step 2: Reverse the first k elements
            reverse(arr, 0, k - 1);
            
            // Step 3: Reverse the remaining n - k elements
            reverse(arr, k, n - 1);
        }
        
        // Print the rotated array
        for(int i = 0; i < n; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(arr[i]);
        }
        System.out.println();
        
        sc.close();
    }
}
