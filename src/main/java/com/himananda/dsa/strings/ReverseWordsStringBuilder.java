package com.himananda.dsa.strings;

public class ReverseWordsStringBuilder {

    public static void main(String[] args) {
        System.out.println(revWords("apple banana kiwi")); // kiwi banana apple
        System.out.println(revWords("I am John Doe"));     // Doe John am I
        System.out.println(revWords("orange"));            // orange
    }

    public static String revWords(String str) {
        String[] words = str.split(" ");
        StringBuilder res = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            res.append(words[i]);
            if (i != 0) {
                res.append(" ");
            }
        }

        return res.toString();
    }
    
}



/*
Big O Complexity Analysis
Time Complexity:

str.split(" "):
Splits the string into words — O(n), where n is the length of the input string.

Reverse iteration with append:
You loop over m words (m ≤ n) once, appending each to StringBuilder. Appending a string to a StringBuilder is amortized O(1), so total is O(m).

toString() and trim():
toString() copies the internal buffer into a new String — O(n).
trim() scans to remove whitespace — O(n) worst case.

Overall:
O(n) time complexity, dominated by the split and output string creation.

Space Complexity:

The array of words takes O(m) space.

The StringBuilder stores the result, O(n) space for the final string.

So total O(n) extra space.

Summary:
Operation	Time Complexity	Space Complexity
split	O(n)	O(m)
reverse append	O(m)	O(n)
toString + trim	O(n)	O(n)
Total	O(n)	O(n)
 */
