package com.himananda.dsa.numbers;

public class NumberPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome(12321)); // true
        System.out.println(isPalindrome(12345)); // false
        System.out.println(isPalindrome(21));    // false
        System.out.println(isPalindrome(24553)); // false
        System.out.println(isPalindrome(7));     // true

    }

    private static boolean isPalindrome(int num) {
        int original = num;
        int rev = 0;

        while (num > 0) {
            rev = num % 10 + rev * 10;
            num = num / 10;
        }

        return original == rev;
    }
}


/*
✅ Time Complexity: O(log₁₀ n)
Each iteration of the while (num > 0) loop processes one digit of num.

The number of digits in n is ⌊log₁₀ n⌋ + 1, so the loop runs approximately log₁₀ n times.

➡️ Time Complexity: O(log n) (base 10 is typically omitted in Big O)

✅ Space Complexity: O(1)
Only a few integer variables (original, rev, num) are used.

No additional space grows with input size.

➡️ Space Complexity: O(1)
 */
