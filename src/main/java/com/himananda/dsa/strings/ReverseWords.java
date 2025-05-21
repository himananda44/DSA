package com.himananda.dsa.strings;

public class ReverseWords {

    public static void main(String[] args) {
        System.out.println(revWords("apple banana kiwi"));  // kiwi banana apple
        System.out.println(revWords("I am John Doe"));      // Doe John am I
        System.out.println(revWords("orange"));             // orange
    }

    static String revWords(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        String[] words = str.split(" ");
        int left = 0, right = words.length - 1;

        while (left < right) {
            String temp = words[left];
            words[left++] = words[right];
            words[right--] = temp;
        }

        return String.join(" ", words);
    }
}


/*
Time Complexity
str.split(" ")
Splitting the string into an array of words is O(n), where n is the length of the input string. Because the split has to iterate over all characters.

Reversing the array
The while loop swaps elements from start to end, performing about n/2 swaps, where n is the number of words.
This is O(m) where m = number of words (m ≤ n).

String.join(" ", words)
Joining the words back together also requires iterating through all words and concatenating them, which is O(n) where n is the total length of the final string.

Overall Time Complexity:
Dominated by splitting and joining the string: O(n)

Reversing the words array is O(m) but since m ≤ n, it’s still O(n).

Final time complexity:
O(n) linear time, proportional to the length of the input string.

Space Complexity
split method creates an array of words — uses O(m) extra space, where m is the number of words.

The array is modified in place for reversal (no extra arrays used).

String.join creates a new string of length n — so O(n) space.

Overall Space Complexity:
Mainly the array of words and the resulting joined string.

Total extra space: O(n) (proportional to input string length).

Summary:
Operation	Time Complexity	Space Complexity
split	O(n)	O(m)
reverse (in-place)	O(m)	O(1)
join	O(n)	O(n)
Total	O(n)	O(n)
 */