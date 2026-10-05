import java.util.Scanner;

public class SumofDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        long num = sc.nextLong();

        int sum = 0;
        while(num > 0){
            sum += num%10;
            num/=10;
        }
        System.out.println("Sum of digits= "+sum);
        sc.close();
    }
}
