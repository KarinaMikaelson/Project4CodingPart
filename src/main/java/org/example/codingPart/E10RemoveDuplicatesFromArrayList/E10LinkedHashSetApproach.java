package org.example.codingPart.E10RemoveDuplicatesFromArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
/*
How can you remove all duplicates from ArrayList?
 */
public class E10LinkedHashSetApproach {
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> originalList ){

        Set<Integer> set = new LinkedHashSet<>(originalList);
        originalList.clear();
        originalList.addAll(set);
        return originalList;
    }
    public static void main(String[] args) {

        ArrayList<Integer> originalList = new ArrayList<>();
        originalList.add(1);
        originalList.add(10);
        originalList.add(1);
        originalList.add(2);
        originalList.add(2);
        originalList.add(3);
        originalList.add(10);
        originalList.add(3);
        originalList.add(3);
        originalList.add(4);
        originalList.add(5);
        originalList.add(5);

        System.out.println("ArrayList with duplicates: " + originalList);

        ArrayList<Integer> newList = removeDuplicates(originalList);
        System.out.println("ArrayList with duplicates removed: " + newList);
    }
}

