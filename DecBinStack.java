import java.util.Scanner;
import java.util.Stack;

public class DecBinStack {
    static int to_binary(int dec_number)
    {
        Stack<Integer> stack = new Stack<>();

        // Edge case: if the number is 0, its binary is just 0
        if (dec_number == 0) {
            return 0;
        }

        // Step 1: Divide by 2 and push remainders onto the stack
        while (dec_number > 0) {
            stack.push(dec_number % 2);
            dec_number = dec_number / 2;
        }
 
        int bin_number = 0;
 
        // Step 2: Pop remainders to build the binary number
        while (!stack.isEmpty()) {
            bin_number = (bin_number * 10) + stack.pop();
        }
 
        return bin_number;
    }
 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
 
        int Dec_number;
 
        System.out.println("Enter number:");
        Dec_number = sc.nextInt();
 
        System.out.print("Binary is:" + to_binary(Dec_number));
        sc.close();
    }
}