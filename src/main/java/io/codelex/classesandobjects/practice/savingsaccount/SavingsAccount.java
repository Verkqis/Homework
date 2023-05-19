package io.codelex.classesandobjects.practice;

import java.math.BigDecimal;

public class SavingsAccount {


    private BigDecimal balance = new BigDecimal(0);
    private BigDecimal withdraw = new BigDecimal(0);
    private BigDecimal deposit = new BigDecimal(0);
    private BigDecimal monthlyAdd = new BigDecimal(0);

    public SavingsAccount(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal withdraw(BigDecimal withdraw) {
        balance = balance.subtract(withdraw);
        return balance;
    }

    public BigDecimal deposit(BigDecimal deposit) {
        balance = balance.add(deposit);
        return balance;
    }

//    public BigDecimal monthlyAdd(BigDecimal monthlyAdd) {
//        balance = balance.subtract(withdraw);
//        return balance;
//    }
}
