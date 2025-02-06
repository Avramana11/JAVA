import java.util.*;
// Problem Description:

// Write a program to swap two integer variables without using a temporary variable.

// Input: a = 5, b = 10
// Output: a = 10, b = 5

// Explanation:
// The program swaps the values of a and b using arithmetic or bitwise operations, resulting in a being 10 and b being 5.

public class practise {
    public static void main(String[] args) {
        int a = 5, b = 10;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a + ", b = " + b);
    }
}

// Problem Description:
// Write a method to check if a given string is a palindrome (reads the same forwards and backwards).

// Input: str = ""madam""
// Output: true

// Input: str = ""hello""
// Output: false

// Explanation:
// For the input string ""madam"", it reads the same forwards and backwards, so the output is true. For ""hello"", it does not, so the output is false.


public class practise {
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("hello"));
    }
}


// Write a program that prints the numbers from 1 to n. For multiples of three, print ""Fizz"" instead of the number, and for multiples of five, print ""Buzz"". For numbers which are multiples of both three and five, print ""FizzBuzz"".

// Input: n = 15
// Output:
// 1
// 2
// Fizz
// 4
// Buzz
// Fizz
// 7
// 8
// Fizz
// Buzz
// 11
// Fizz
// 13
// 14
// FizzBuzz

// Explanation:
// The program iterates through numbers from 1 to 15 and replaces multiples of 3 with ""Fizz"", multiples of 5 with ""Buzz"", and multiples of both with ""FizzBuzz""."

public class practise {
    public static void main(String[] args) {
        int n = 15;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}

