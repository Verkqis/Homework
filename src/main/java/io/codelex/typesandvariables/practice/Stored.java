package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Stored {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name ? ");
        String name = sc.nextLine();

        System.out.println("What is your year of birth ? ");
        int yearOfBirth = Integer.parseInt(sc.nextLine());
        System.out.println("My name is " + name + " and I was born in " + yearOfBirth + ".");





    }
}
