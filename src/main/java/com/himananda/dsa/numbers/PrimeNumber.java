package com.himananda.dsa.numbers;

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println(isPrime(29)); // true
        System.out.println(isPrime(35)); // false
        System.out.println(isPrime(20)); // false
        System.out.println(isPrime(27)); // false
        System.out.println(isPrime(7));  // true
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime numbers
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false; // divisible by i, not prime
            }
        }

        return true; // no divisors found, number is prime
    }
}



/*
Time Complexity Explanation:
The method checks divisibility by all numbers from 2 up to num / 2.

In the worst case (when num is prime), it will perform roughly num/2 - 1 iterations.

Each iteration performs a constant time operation (num % i).

Thus, the time complexity is:

𝑂
(
𝑛
2
)
=
𝑂
(
𝑛
)
O( 
2
n
​
 )=O(n)
where n is the input number num.

Space Complexity:
The method uses a fixed amount of extra space (just a few variables), so:

𝑂
(
1
)
O(1)

 */