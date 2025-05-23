package com.himananda.dsa.arrays;

import java.util.Arrays;

public class MoveZerosToEnd2 {

    public static void moveZerosToEnd(int[] arr) {
        int nonZeroIndex = 0;

        // Traverse the array and move non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex++] = arr[i];
            }
        }

        // Fill the remaining positions with zeros
        while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        System.out.println("Before: " + Arrays.toString(arr));
        moveZerosToEnd(arr);
        System.out.println("After:  " + Arrays.toString(arr));
    }
    
}


/*
Time Complexity: O(n)

Also loops over the array once.

Space Complexity: O(1)

No extra memory used (just variables for indexing and temporary swapping).


 */
