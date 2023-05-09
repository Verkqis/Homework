package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class StringUpperCaseLetters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! Please add words you want make acronym from, start words with capital letter! ");
        String stringsFor = sc.nextLine();
        String stringForUpper = stringsFor.replaceAll("[^A-Z]", "");
        System.out.println(stringForUpper);
    }

}
