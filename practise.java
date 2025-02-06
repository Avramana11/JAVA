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
