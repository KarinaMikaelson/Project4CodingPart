package org.example.codingPart.E3ReverseString;
/*
3. Reverse a String: Write a function to reverse a given string.
For example, given the input "Hello", the output should be "olleH".
 */
public class E3ReverseString { //USING FOR LOOP
    public static String reverse(String str){

        StringBuilder reversed = new StringBuilder();
        for(int i = str.length()-1; i >= 0; i--){
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
    public static void main(String[] args) {
        String input = "Hello";
        String reversedString = reverse(input);
        System.out.println(reversedString);
    }
}


