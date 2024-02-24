package com.test.arraylist;
import java.util.ArrayList;
import java.util.List;

public class SearchElementsInArrayListExample6 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Bob");
        names.add("bill");

        // Check if an ArrayList contains a given element
        System.out.println("Does names array contain bob : " + names.contains("test"));


        // Find the index of the last occurrence of an element in an ArrayList
        System.out.println("lastIndexOf " + names.lastIndexOf("John"));
        System.out.println("lastIndexOf " + names.lastIndexOf("bill"));
        System.out.println(names.lastIndexOf("test"));
    }
}
