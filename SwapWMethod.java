import java.util.Scanner;

public class SwapWMethod {

    public static void swap(int[]a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[]arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        if(n>0){
            swap(arr, 0, n-1);
        }
        for(int i= 0; i<n;i++){
            if(i>0){
                System.out.print(" ");
            }
            System.out.println(arr[i]);
        }
        System.out.println();
        sc.close();
    }
}
