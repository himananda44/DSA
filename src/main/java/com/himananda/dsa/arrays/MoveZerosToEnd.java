package com.himananda.dsa.arrays;

import java.util.Arrays;

public class MoveZerosToEnd {

    public static void main(String[] args) {
        int[] arr = {1, 6, 0, 3, 4, 1, 6, 5, 0};

        System.out.println("Original: " + Arrays.toString(arr));
        System.out.println("Result:   " + Arrays.toString(moveZerosToEnd(arr)));
    }

    private static int[] moveZerosToEnd(int[] arr) {
        int[] result = new int[arr.length];
        int index = 0;

        for (int num : arr) {
            if (num != 0) {
                result[index++] = num;
            }
        }

        return result;
    }
}



/*
Time Complexity: O(n)

You loop over the array once: each element is visited exactly once.

Space Complexity: O(n)

You allocate a new array of the same size.
 */