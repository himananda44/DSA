package com.himananda.dsa.strings;

public class RemoveWhiteSpaces2 {

    public static void main(String[] args) {
        
        String str = "Himananda is a Honest Guy, he should be respected alltimes";

        String strWithoutWhiteSpaces = str.replaceAll("\\s+", "");
        System.out.println(strWithoutWhiteSpaces);
    }
    
}


/*
🔍 How it works:
replaceAll("\\s+", ""):

\\s+ is a regular expression that matches one or more whitespace characters.

Java internally compiles the regex and applies it to the input string to find all matches and construct a new string with those characters removed.

🕒 Time Complexity: O(n)
n is the length of the input string.

Even though regex is involved, the replaceAll method processes each character once while scanning for matches.

In the worst case (no whitespaces), every character is examined once — still O(n).

💾 Space Complexity: O(n)
A new string is constructed with whitespace removed.

In the worst case (no whitespace), the new string has nearly the same size → O(n) space.

✅ Summary:
Time Complexity: O(n)

Space Complexity: O(n)

Regex here doesn't significantly affect the complexity because the pattern \\s+ is simple and efficiently handled by the regex engine.


 */