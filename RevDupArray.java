import java.util.Scanner;

public class RevDupArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
 
        int newLength = 0;
        if (n > 0) {
            newLength = 1;                       // arr[0..newLength-1] holds the unique values
            for (int i = 1; i < n; i++) {
                if (arr[i] != arr[newLength - 1]) {
                    arr[newLength] = arr[i];     // overwrite in place, no second array
                    newLength++;
                }
            }
        }
 
        System.out.println("New Length = " + newLength);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < newLength; i++) {
            if (i > 0) sb.append(' ');
            sb.append(arr[i]);
        }
        System.out.println(sb);
}
