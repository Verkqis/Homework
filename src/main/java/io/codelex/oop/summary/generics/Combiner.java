package io.codelex.oop.summary.generics;

public class Combiner {

    public static <T> void combineTwoItems(T first, T second) {
        System.out.println("First item: " + first.toString() + "; Second item: " + second.toString());
    }

    public static void main(String[] args) {

        combineTwoItems(122.222, "String");

        
    }

}
