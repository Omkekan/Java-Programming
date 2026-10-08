import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class GroupSlidingWindow {

    public static void processGroupsOfThree(int[] arr) {
        int k = 3; // Window size

        if (arr == null || arr.length < k) {
            System.out.println("Array is too small.");
            return;
        }

        // By default, PriorityQueue puts the smallest number at the front. 
        // Collections.reverseOrder() flips it to put the LARGEST number at the front (Max-Heap).
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // Process the very first window of size 3
        for (int i = 0; i < k; i++) {
            pq.offer(arr[i]);
        }
        
        System.out.print("Window: " + Arrays.toString(Arrays.copyOfRange(arr, 0, k)));
        System.out.println(" -> Max Value: " + pq.peek());

        // Slide the window across the rest of the array
        for (int i = k; i < arr.length; i++) {
            // Remove the element that is sliding OUT of the window (left side)
            pq.remove(arr[i - k]); 
            
            // Add the new element that is sliding INTO the window (right side)
            pq.offer(arr[i]);      

            // Print the new window and its max value
            int[] currentWindow = Arrays.copyOfRange(arr, i - k + 1, i + 1);
            System.out.print("Window: " + Arrays.toString(currentWindow));
            System.out.println(" -> Max Value: " + pq.peek());
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 50, 30, 80, 20, 60};
        
        System.out.println("Extracting groups of 3 and finding the max:\n");
        processGroupsOfThree(arr);
    }
}