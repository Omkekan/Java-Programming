import java.util.Scanner;

public class RevArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No of elements: ");
        int num = sc.nextInt();
        int Arr[];
        Arr = new int[num];
        System.out.println("Enter elements: ");
        for(int i = 0; i< num; i++){
            Arr[i] = sc.nextInt();
        }

        int left = 0, right = num - 1;
        while (left< right) {
            int temp = Arr[left];
            Arr[left] = Arr[right];
            Arr[right] = temp;
            left++;
            right--;
        }

        for( int i = 0; i < num; i++){
            if(i>0){
                System.out.println(" ");
            }
            System.out.println(Arr[i]);
        }
        System.out.println();
    }
}
