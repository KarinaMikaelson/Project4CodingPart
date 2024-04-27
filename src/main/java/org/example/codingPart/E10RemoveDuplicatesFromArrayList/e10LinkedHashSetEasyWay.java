package org.example.codingPart.E10RemoveDuplicatesFromArrayList;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/*
How can you remove all duplicates from ArrayList?
 */
public class e10LinkedHashSetEasyWay {
    public static void main(String[] args) {

        List<Integer> originalList = new ArrayList<>();
        originalList.add(4);
        originalList.add(5);
        originalList.add(7);
        originalList.add(5);
        originalList.add(3);
        originalList.add(8);
        originalList.add(4);
        originalList.add(5);

        Set<Integer> set = new LinkedHashSet<>(originalList);
        System.out.println(originalList);

        List<Integer> newList = new ArrayList<>(set);
        System.out.println(newList);
    }
}
