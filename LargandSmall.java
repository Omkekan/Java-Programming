import java.util.Scanner;

public class LargandSmall {
    public static void main(String[] args) {
        int Arr[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements: ");
        int num = sc.nextInt();
        Arr = new int[num];
        System.out.println("Enter Elements: ");
        for(int i = 0; i< num; i++){
            Arr[i]=sc.nextInt();
        }

        int large = Arr[0], small = Arr[0];
        for(int i = 1; i< num; i++){
            if (Arr[i]>large) {
                large = Arr[i];
            }else if (Arr[i]< small) {
                small = Arr[i];
            }
        }
        sc.close();

        System.out.println("Largest number: "+ large);
        System.out.println("Smallest number: "+small);

    }
}
