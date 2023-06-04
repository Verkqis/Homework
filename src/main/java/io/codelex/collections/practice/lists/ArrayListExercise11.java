package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        //TODO: Create an ArrayList with String elements
        List<String> elements = new ArrayList<>();

        //TODO: Add 10 values to list
        elements.add("el1");
        elements.add("el2");
        elements.add("el3");
        elements.add("el4");
        elements.add("el5");
        elements.add("el6");
        elements.add("el7");
        elements.add("el8");
        elements.add("el9");
        elements.add("el10");

        //TODO: Add new value at 5th position
        elements.add(4, "Beaver");

        //TODO: Change value at last position (Calculate last position programmatically)
        elements.set(9, "WOO");

        //TODO: Sort your list in alphabetical order
        Collections.sort(elements);

        //TODO: Check if your list contains "Foobar" element
        if (elements.contains("Foobar")) {
            System.out.println("Contains");
        } else {
            System.out.println("There is no Foobar! ");
        }

        //TODO: Print each element of list using loop
        for (String el : elements) {
            System.out.println(el);
        }

    }

}
