import java.util.Scanner;
import java.util.Stack;

public class RevStringStack {
    static String reverse_word(String word) {
        // Use StringBuilder instead of String concatenation for better performance
        StringBuilder rword = new StringBuilder();

        Stack<Character> stack = new Stack<>();

        // FIX: Changed <= to < so it doesn't go out of bounds
        for(int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }
        
        while (!stack.isEmpty()) {
            rword.append(stack.pop());
        }

        return rword.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter word:");
        String word = sc.next();

        System.out.print("\nReverse word is: " + reverse_word(word));
        sc.close();
    }
}