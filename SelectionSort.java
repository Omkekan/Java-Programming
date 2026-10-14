public class SelectionSort {

    static void selection_sort(int a[]) {
        int i, j, min, position;
        for (i = 0; i < a.length - 1; i++) { // Because we require n - 1 passes only
            min = a[i];
            position = i;
            for (j = i + 1; j < a.length; j++) { // Because we require J to stop at the second-last position, then only J + 1 is last.
                if (a[j] < min) { // Smaller than min. Update min and position.
                    min = a[j];
                    position = j;
                }
            }
            a[position] = a[i]; // Copy i-th to the position of minimum.
            a[i] = min; // Let minimum be on i position.
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Original array:");
        printArray(arr);

        selection_sort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }

    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}