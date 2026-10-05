import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int Arr[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int num = sc.nextInt();

        Arr = new int[num];
        int even = 0, odd = 0;
        System.out.println("Enter Numbers: ");
        for(int i = 0; i < num; i++){
            Arr[i]= sc.nextInt();
            if (Arr[i]%2==0) {
                even++;
            }else{
                odd++;
            }
        }

        sc.close();

        System.out.println("Even Numbers = "+ even);
        System.out.println("Odd Numbers = "+odd);
        
    }
}
