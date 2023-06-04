package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("Duplicates")
public class ArrayListExercise4 {

    public static void main(String[] args) {
        // Create a list and add some colors to the list
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");

        List<String> colors2 = new ArrayList<>();
        colors2.add("Brown");
        colors2.add("Pink");
        colors2.add("Blue");
        colors2.add("Gray");
        colors2.add("Yellow");

        String element = colors2.get(0);
        System.out.println("First element: " + element);

        element = colors2.get(2);
        System.out.println("Third element: " + element);
    }
}
