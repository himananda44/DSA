package com.himananda.dsa.arrays;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {2, 6, 1, 4, 9, 23, 5, 7};
        int[] reversed = reverseArray(arr);
        System.out.println(Arrays.toString(reversed));
    }

    private static int[] reverseArray(int[] arr) {
        if (arr == null || arr.length < 2) return arr;

        int left = 0, right = arr.length - 1;

        while (left < right) {
            // Swap elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return arr;
    }
}



/*
✅ Time Complexity: O(n)
The method loops through half the array (from both ends toward the center), but Big O ignores constants.

So, even though it swaps n/2 pairs, it's considered O(n).

📌 Reason: Every element is visited once (in a pair), resulting in linear time with respect to the size of the input array.

✅ Space Complexity: O(1)
The reversal is done in-place, without allocating extra space for another array (only a few temp variables).

📌 Reason: The amount of additional memory used does not grow with input size — it's constant.

Summary:
Complexity Type	Value
Time	O(n)
Space	O(1)
 */