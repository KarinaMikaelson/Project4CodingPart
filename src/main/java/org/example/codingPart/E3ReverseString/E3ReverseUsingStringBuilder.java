package org.example.codingPart.E3ReverseString;
/*
3. Reverse a String: Write a function to reverse a given string.
For example, given the input "Hello", the output should be "olleH".
 */

public class E3ReverseUsingStringBuilder {
    public static void main(String[] args) {
        String input = "Hello";
        StringBuilder input1 = new StringBuilder();
        input1.append(input);
        input1.reverse();
        System.out.println(input1);
    }
}
