package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> uniqueNames = new HashSet<>();

        System.out.println("Enter names (one per line). Press Enter without typing anything to finish.");

        String input = scanner.nextLine();
        while (!input.isEmpty()) {
            uniqueNames.add(input);

            input = scanner.nextLine();
        }

        System.out.print("Unique name list contains:");
        for (String name : uniqueNames) {
            System.out.print(" " + name);
        }

    }


}
