public class InsertionSort {
    public static void insertion_sort(int a[]) {
        int i, j, new_element;
        for (i = 0; i < a.length - 1; i++) {
            j = i + 1;
            new_element = a[i + 1];
            while (j > 0 && a[j - 1] > new_element) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = new_element;
        }
    }

    public static void main(String[] args) {
        int[] a = {5, 2, 10, 3, 1, 8};

        System.out.println("Before sorting:");
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println();

        insertion_sort(a);

        System.out.println("After sorting:");
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
