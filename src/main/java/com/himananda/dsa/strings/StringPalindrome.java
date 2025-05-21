package com.himananda.dsa.strings;

public class StringPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("Himananda")); // false
        System.out.println(isPalindrome("abcba"));     // true
        System.out.println(isPalindrome("a"));         // true
        System.out.println(isPalindrome("ab"));        // false
    }

    private static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}


/*
✅ Time Complexity:
The while (left < right) loop compares characters from both ends and moves inward.

It runs approximately n/2 times, where n is the length of the input string.

Each comparison is O(1).

So, Time Complexity = O(n), linear in the size of the string.

✅ Space Complexity:
No additional data structures are used (no arrays, lists, etc.).

Only a few integer variables (left, right).

So, Space Complexity = O(1) (constant space).

Summary:
Complexity Type	Value
Time Complexity	O(n)
Space Complexity	O(1)
 */