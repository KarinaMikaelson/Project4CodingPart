package org.example.codingPart.E2AlphaCharactersString;
/*
2. Find out how many alpha characters are present in a string?
 */
public class E2AlphaCharactersString {
    public static void main(String[] args) {

        String str = "Hello World 123";
        int count = countAlphabets(str);
        System.out.println("Number of alphabetic characters in the string: " + count);
    }
    public static int countAlphabets(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                count++;
            }
        }
        return count;
    }
}


