package io.codelex.classesandobjects.practice;

public class AccountApp {

    public static void main(String[] args) {
        Account firstAccount = new Account("First Account", 100.0);
        firstAccount.deposit(20.0);
        System.out.println(firstAccount);

        Account Matt = new Account("Matt's account", 1000);
        Account MyAccount = new Account("My account", 0);

        Matt.withdrawal(100.0);
        MyAccount.deposit(100.0);

        System.out.println(Matt);
        System.out.println(MyAccount);

        Account A = new Account("A", 100.0);
        Account B = new Account("B", 0.0);
        Account C = new Account("C", 0.0);

        Account.transfer(A, B, 50.0);
        Account.transfer(B, C, 25.0);

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

    }
}
