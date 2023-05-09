package io.codelex.typesandvariables.practice;


import java.util.Arrays;

public class Schedule {

    public static void main(String[] args) {

        String[][] schedule = {
                {"1", "English III", "Ms. Lapan"},
                {"2", "Precalculus", "Mrs. Gideon"},
                {"3", "Music Theory", "Mr. Davis"},
                {"4", "Biotechnology", "Ms. Palmer"},
                {"5", "Principles of Technology I", "Ms. Garcia"},
                {"6", "Latin II", "Mrs. Barnett"},
                {"7", "AP US History", "Ms. Johannessen"},
                {"8", "Business Computer Information Systems", "Mr. James"}
        };

        for (String[] el : schedule) {
            System.out.println(Arrays.deepToString(el));
        }

    }




}
