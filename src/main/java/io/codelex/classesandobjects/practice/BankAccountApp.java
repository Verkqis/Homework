package io.codelex.classesandobjects.practice;

public class BankAccountApp {

    public static void main(String[] args) {

        BankAccount benson = new BankAccount("Benson", 17.25);

        BankAccount benson2 = new BankAccount("Benson", -17.50);

        benson.toString();
        benson2.toString();
    }
}
