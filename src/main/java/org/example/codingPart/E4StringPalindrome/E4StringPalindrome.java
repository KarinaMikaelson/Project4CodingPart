package org.example.codingPart.E4StringPalindrome;
/*
4. Check if a String is Palindrome: Determine whether a given string is a palindrome,
which means it reads the same forwards and backward.
For example, "madam" is a palindrome.
 */
public class E4StringPalindrome {
    public static class PalindromeChecker {
        public static boolean isPalindrome(String str) {
            int left = 0;
            int right = str.length() - 1;
            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }
    public static void main(String[] args) {
        String input = "madam";
        boolean isPalindrome = PalindromeChecker.isPalindrome(input);
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
