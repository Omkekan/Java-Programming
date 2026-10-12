/*The Problem:
You are given a string of lowercase letters. If two identical letters are right next to each other, they destroy each other.

Input: "abbaca"

Process: "bb" destroys itself ➔ "aaca". Then "aa" destroys itself ➔ "ca".

Output: "ca"


The Logic (Check your conditions):

Condition A: Is the stack NOT empty (!stack.isEmpty()) AND does the top of the stack (stack.peek()) exactly match current?

Action A: If yes, we found a match! Destroy it by taking it out of the stack: stack.pop();

Condition B (Else): If they don't match (or if the stack is empty)...

Action B: Put the current letter into the stack: stack.push(current);
*/


import java.util.Stack;

public class CandCrushStack {
  
    public static String removeDuplicates(String word) {
        
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i<word.length(); i++){
        		char current = word.charAt(i);
        		if(!stack.isEmpty() && stack.peek() == current){
        			stack.pop();
        		}else{
        			stack.push(current);
        		}
        }
        
        
        // (This trick safely turns the surviving stack items into a string)
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }
        return result.toString();
    }   
}
