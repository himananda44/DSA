package com.himananda.dsa.arrays;

public class SecondLargestElementInAnArray {

    public static void main(String[] args) {
        int[] arr = {2, 6, 1, 4, 9, 23, 5, 7};
        try {
            int secondLargest = getSecondLargest(arr);
            System.out.println("Second Max Number is : " + secondLargest);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Returns the second largest element in the array.
     * Throws IllegalArgumentException if array has fewer than 2 distinct elements.
     */
    static int getSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        boolean foundSecondMax = false;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
                foundSecondMax = true;
            } else if (num > secondMax && num < max) {
                secondMax = num;
                foundSecondMax = true;
            }
        }

        if (!foundSecondMax) {
            throw new IllegalArgumentException("Array does not have a second largest distinct element.");
        }

        return secondMax;
    }
}
