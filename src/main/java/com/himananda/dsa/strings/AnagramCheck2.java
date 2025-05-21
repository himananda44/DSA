package com.himananda.dsa.strings;

import java.util.Arrays;

public class AnagramCheck2 {

    public static void main(String[] args) {
        System.out.println(isAnagram("abcba", "abcab"));         // true
        System.out.println(isAnagram("abcd", "bcds"));           // false
        System.out.println(isAnagram("ab", "bs"));               // false
        System.out.println(isAnagram("ab", "bsss"));             // false
        System.out.println(isAnagram("aaabbddd", "babadadd"));   // true
    }

    private static boolean isAnagram(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        
        return Arrays.equals(ch1, ch2);
    }
}





/*
🔍 Time Complexity:
Let n be the length of the strings (since both must be equal to proceed):

Building frequency map for str1:

Iterates through all characters → O(n)

Iterating over str2 to update the map:

Another loop over n characters → O(n)

HashMap operations (put, getOrDefault, remove, containsKey):

Each is O(1) on average due to hash-based lookup

✅ Total Time Complexity:
O(n)

🧠 Space Complexity:
A HashMap stores character counts.

In the worst case, all characters in str1 are unique → O(k), where k is the alphabet size.

For English lowercase letters, k = 26, so it's O(1) (constant space), but to be general:

✅ Space Complexity:
O(k), where k ≤ n (number of unique characters in the string)

Summary:
Complexity Type	Value
Time	O(n)
Space	O(k)
 */