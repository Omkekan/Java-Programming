import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountFrequencies {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
 
        // LinkedHashMap keeps elements in the order they first appear
        Map<Integer, Integer> freq = new LinkedHashMap<>();
        for (int x : arr) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
 
        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
