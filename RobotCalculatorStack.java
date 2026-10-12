/*
You are given an array of Strings called tokens. Each token is either a number, a "+", or a "*".

Input: String[] tokens = {"2", "1", "+", "3", "*"}

Output: Return the final int answer.

Create a Stack<Integer> (Notice it's Integer this time, not Character, because we are doing math!).

Look at every token in the tokens array using a for loop.

If the token .equals("+"):

Pop the top number and save it in a variable (e.g., int a = stack.pop();).

Pop the next number and save it (int b = stack.pop();).

Add them together, and push() the result back into the stack.

Else if the token .equals("*"):

Do the exact same thing, but multiply (*) them instead, and push() the result.

Else (it must be a number!):

Convert the token to a number using Integer.parseInt(token).

push() that number into the stack.

When the loop is over, return the last number sitting in the stack (stack.pop()).
*/

import java.util.Stack;

public class RobotCalculatorStack {
    
    public static int calculate(String[] tokens) {
        
        Stack<Integer> stack = new Stack<>();
        
        // Fix 1: Loop over the tokens array
        for(int i = 0; i < tokens.length; i++){
            
            // Fix 2: Grab the current token
            String token = tokens[i];
            
            if(token.equals("+")){
                // Fix 3: pop() doesn't need an 'i'
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a + b);
                
            } else if(token.equals("*")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a * b);
                
            } else {
                // Fix 4: Parse the number AND push it in one step
                stack.push(Integer.parseInt(token));
            }
        }
        
        int result = stack.pop();
        return result;
    }
}
