package com.himananda.dsa.strings;

public class RemoveWhiteSpaces {

    public static void main(String[] args) {
        
        String str = "Himananda is a Honest Guy, he should be respected alltimes";

        String strWithoutWhiteSpaces = removeWhiteSpaces(str);
        System.out.println(strWithoutWhiteSpaces);
    }

private static String removeWhiteSpaces(String str) {
    String[] strArr = str.split(" ");
    StringBuilder sb = new StringBuilder(); // <-- initialize here

    for (String s : strArr) {
        sb.append(s);
    }

    return sb.toString(); // better than String.valueOf(sb)
}
    
}


/*
Time Complexity:
str.split(" "):

Splits the string on spaces.

Worst case: O(n) where n is the length of the string, because it scans every character.

If the string has k words, it creates a string array of size k.

for (String s : strArr):

Iterates over each word and appends it.

Total characters appended: still O(n) in total, since all characters (minus spaces) are processed once.

sb.toString():

Converts the StringBuilder to a string — this is O(n).

✅ Total Time Complexity = O(n)
(n = length of the input string)

Space Complexity:
strArr[]:

Stores k strings (words). Total space is proportional to all characters (minus the spaces) → O(n).

StringBuilder sb:

Holds the entire output string → O(n).

✅ Total Space Complexity = O(n)

Summary:
Time Complexity: O(n)

Space Complexity: O(n)
 */