import java.util.Scanner;

public class PalindromeString {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        boolean isPalindrome = true;
        int left = 0, right = s.length() -1;
        while (left<right) {
            if (s.charAt(left) != s.charAt((right))) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(isPalindrome ? "Palindrome": "not Palindrome");
        sc.close();
    }
}
