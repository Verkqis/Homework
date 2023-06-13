package io.codelex.classesandobjects.practice;

// Each BankAccount object represents one user's account
// information including name and balance of money.

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class BankAccount {

    DecimalFormat df = new DecimalFormat("###,##0.00");

    public String name;
    public double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public final void deposit(double amount) {
        balance = balance + amount;
    }

    public final void withdraw(double amount) {
        balance = balance - amount;
    }

    @Override
    public String toString() {
        String fixBalanceFormat;
        BigDecimal b = new BigDecimal(balance);
        if (b.compareTo(BigDecimal.ZERO) < 0) {
            fixBalanceFormat = "-$" + df.format(b.abs());
            System.out.println(name + ", " + fixBalanceFormat);
        } else {
            System.out.println(name + ", " + balance);
        }
        return null;
    }

}
