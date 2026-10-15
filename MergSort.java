public class MergSort {
    public static void merge_sort(int a[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            merge_sort(a, start, mid);
            merge_sort(a, mid + 1, end);
            merger(a, start, mid, end);
        }
    }

    public static void merger(int a[], int start, int mid, int end) {
        int i, j, temp[], t_index;
        i = start;
        t_index = start;
        j = mid + 1;
        temp = new int[a.length];
        
        // Temporary array which will hold sorted data for the next pass
        while (i <= mid && j <= end) {
            // Compare both blocks till data in both
            if (a[i] < a[j])
                temp[t_index++] = a[i++];
            else
                temp[t_index++] = a[j++];
        }
        
        while (i <= mid) // Copy left over
            temp[t_index++] = a[i++];
            
        while (j <= end) // Copy left over
            temp[t_index++] = a[j++];
            
        // Copy back to a
        for (i = start; i <= end; i++)
            a[i] = temp[i];
    }

    public static void main(String[] args) {
        int[] a = {10, 5, 1, 8, 3};
        
        System.out.println("Before sorting:");
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        merge_sort(a, 0, a.length - 1);
        
        System.out.println("After sorting:");
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
