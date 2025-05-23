package com.himananda.dsa;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        //String s = "[()()]{}";
         //String s = "[()()]{";
         String s = "[)";

        System.out.println("S - Valid Parentheses : " + validParentheses(s));
    }

    private static boolean validParentheses(String s) {
        if ((s.length() % 2) != 0) return false;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                stack.add(c);
            } else {
                if (stack.isEmpty()) return false;

                char ch = stack.pop();

                if (ch == '(' && c != ')') return false;
                if (ch == '{' && c != '}') return false;
                if (ch == '[' && c != ']') return false;
            }
        }

        return stack.isEmpty();
    }
}


/*
Time Complexity
O(n), where n is the number of characters in the string.

Space Complexity
O(n). The space complexity is O(n) because a stack is used, and in the worst case, all characters in the string will be stored in the stack, which grows with the input size.
 */