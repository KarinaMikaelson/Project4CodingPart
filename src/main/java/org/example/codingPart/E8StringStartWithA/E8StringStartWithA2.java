package org.example.codingPart.E8StringStartWithA;

import java.util.ArrayList;
import java.util.List;

/*
8. You have a list of strings and you want to keep only those that
start with “A” and you want to return them in lower case".
-----------------------------------------------------------
 */
public class E8StringStartWithA2 {
    public static List<String> filterAndConvertToLowerCase(List<String> cityList) {

        List<String> filteredAndLowerCaseList = new ArrayList<>();

        for (String city : cityList) {
            if (city.toLowerCase().startsWith("a")) {
                filteredAndLowerCaseList.add(city.toLowerCase());
            }
        }
        return filteredAndLowerCaseList;
    }

    public static void main(String[] args) {
        List<String> cityList = new ArrayList<>();
        cityList.add("Astana");
        cityList.add("Paris");
        cityList.add("Amsterdam");
        cityList.add("London");
        cityList.add("Dublin");
        cityList.add("Antalya");

        List<String> filteredAndLowerCaseList = filterAndConvertToLowerCase(cityList);
        System.out.println(filteredAndLowerCaseList);
    }
}
