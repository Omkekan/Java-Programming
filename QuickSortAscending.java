public class QuickSortAscending {
    static void quick_sort(int a[], int start, int end) {
        int i, j, pivot;
        i = start;
        j = end;
        pivot = start;
        while (i < j) {
            while (i < j && a[j] > a[pivot])
                j--;
            while (i < j && a[i] <= a[pivot])
                i++;
            if (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[pivot];
        a[pivot] = a[j];
        a[j] = temp;
        
        if (start < j)
            quick_sort(a, start, j - 1);
        if (end > j)
            quick_sort(a, j + 1, end);
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};  
        System.out.println("Original array:"); 
        printArray(arr);  
        quick_sort(arr, 0, arr.length - 1);  
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