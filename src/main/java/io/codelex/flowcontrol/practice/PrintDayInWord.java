package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PrintDayInWord {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("With day of week you wish to print ? ");
        int dayNumber = in.nextInt();
        if (dayNumber == 0) {
            System.out.println("Monday! ");
        } else if (dayNumber == 1) {
            System.out.println("Tuesday! ");
        } else if (dayNumber == 2) {
            System.out.println("Wednesday! ");
        } else if (dayNumber == 3) {
            System.out.println("Thursday! ");
        } else if (dayNumber == 4) {
            System.out.println("Friday! ");
        } else if (dayNumber == 5) {
            System.out.println("Saturday! ");
        } else if (dayNumber == 6) {
            System.out.println("Sunday! ");
        } else {
            System.out.println("Not a valid day!");
        }


        Scanner sc = new Scanner(System.in);
        System.out.println("With day of week you wish to print ? ");
        int otherWay = sc.nextInt();


        switch (otherWay) {
            case 0:
                System.out.println("Monday! ");
                break;
            case 1:
                System.out.println("Tuesday! ");
                break;
            case 2:
                System.out.println("Wednesday! ");
                break;
            case 3:
                System.out.println("Thursday! ");
                break;
            case 4:
                System.out.println("Friday! ");
                break;
            case 5:
                System.out.println("Saturday! ");
                break;
            case 6:
                System.out.println("Sunday! ");
                break;
            default:
                System.out.println("Not a valid day!");
                break;
        }


    }

}
