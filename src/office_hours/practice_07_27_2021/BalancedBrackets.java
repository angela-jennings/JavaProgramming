package office_hours.practice_07_27_2021;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        System.out.println(isBalanced("({[]})"));
        System.out.println(isBalanced("(){}[]]]]]()()"));
        System.out.println(isBalancedTwo("()({{{{{}}}{[]]]][]"));
    }
        /*
        For compiler, one of the most important task, is balanced brackets

           * Create a method that will accept a String of brackets. Determine if the brackets are balanced.
        Brackets are balanced if the closing bracket matches the opening one.
        https://www.hackerrank.com/challenges/balanced-brackets/problem?h_l=interview&playlist_slugs%5B%5D              =interview-preparation-kit&playlist_slugs%5B%5D=stacks-queues

        Hint: Use HashMap for the bracket pairs and Stack to help keep track of which opening brackets have been        seen and need to be closed

        Ex: {([])} -> balanced
            {[(])} -> not balanced

        Checking for parenthesis is the most important task of a compiler.

        Input: exp = “[()]{}{[()()]()}”
        Output: Balanced

        Input: exp = “[(])”
        Output: Not Balanced

        Stack= Last in First Out

        Algorithm
        Declare a character Stack
        Traverse the string (iter)
        If the current character is a starting/opening bracket ('(' or '[' or '{') push it to stack
        If the current character is a closing bracket (‘)’ or ‘}’ or ‘]’) then pop from the stack and
         if the popped character is the matching starting bracket then fine else brackets are not balanced.
        After complete traversal, if there is some starting bracket left in stack then “not balanced”

        E	pop()
        Removes the object at the top of this stack and returns that object as the value of this function.
        E	push(E item)
        Pushes an item onto the top of this stack.
         */


    public static boolean isBalanced (String str) {
        Stack <Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('(' , ')');
        map.put('[' , ']');
        map.put('{' , '}');

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{') {
                stack.push(str.charAt(i));
            }else if(ch == ')' || ch == ']' || ch == '}'){
                if(stack.isEmpty()) {
                    return false;
                }else if(str.charAt(i) != map.get(stack.pop())){
                    return false;
                }
            }
        }
        if(stack.isEmpty()) {
            return true;
        }else{
            return false;
        }
    }

    public static boolean isBalancedTwo (String str) {
        String open = "{[(";
        Stack <Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('(' , ')');
        map.put('[' , ']');
        map.put('{' , '}');

        for(int i = 0; i < str.length(); i++) {
            if(open.contains("" + str.charAt(i))){
                stack.push(str.charAt(i));
            }else{
                if(stack.isEmpty() || str.charAt(i) != map.get(stack.pop())){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
