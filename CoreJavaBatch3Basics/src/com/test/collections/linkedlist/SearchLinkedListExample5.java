package com.test.linkedlist;

import java.util.LinkedList;

public class SearchLinkedListExample5 {
    public static void main(String[] args) {
        LinkedList<String> employees = new LinkedList<>();

        employees.add("Mark");
        employees.add("Jury");
        employees.add("demo");
        employees.add("David");

        // Check if the LinkedList contains an element
        System.out.println("Does Employees LinkedList contain demo" + employees.contains("demo"));

        // Find the index of the first occurrence of an element in the LinkedList
        System.out.println("indexOf Mark : " + employees.indexOf("Mark"));

        // Find the index of the last occurrence of an element in the LinkedList
        System.out.println("lastIndexOf David"  + employees.lastIndexOf("David"));
    }
}
