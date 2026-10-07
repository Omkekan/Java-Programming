import java.util.Scanner;
import java.util.Stack;

public class WellnessCheck {
    static boolean check(String pattern)
	{
        Stack<Character> stack = new Stack<>();
 
    	for(int i = 0; i<pattern.length(); i++){
            
            char ch = pattern.charAt(i);
            if (ch == '{') {
                stack.push(ch);
            } 
            
            else if (ch == '}') {
                
                if (stack.isEmpty()) {
                    return false;
                }
                
                stack.pop();
            }
        }
 
    	return stack.isEmpty();
	}
 
	public static void main(String[] args)
	{
    	Scanner sc = new Scanner(System.in);
 
    	String pattern;
 
        System.out.println("Enter pattern to check:");
    	pattern = sc.next();
 
        System.out.print(
            "\nPattern is balanced:" + check(pattern)
    	);
        sc.close();

}
}


