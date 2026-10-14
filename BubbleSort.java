public class BubbleSort {
    public static void sort(int[] arr) {
        int n = arr.length;
        
        // n will represent the boundary of the unsorted portion.
        // We loop until the boundary reaches the start of the array.
        while (n > 1) {
            int newBound = 0; 
            
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    // Swap elements
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    
                    // Update our marker to the index where the swap occurred
                    newBound = i;
                }
            }
            
            // All elements after 'newBound' are already sorted.
            // On the next pass, we only need to check up to this new boundary.
            n = newBound;
        }
    }

    public static void main(String[] args) {
        int[] data = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Original array:");
        for (int num : data) System.out.print(num + " ");
        
        sort(data);
        
        System.out.println("\n\nSorted array (Ascending):");
        for (int num : data) System.out.print(num + " ");
    }
}
