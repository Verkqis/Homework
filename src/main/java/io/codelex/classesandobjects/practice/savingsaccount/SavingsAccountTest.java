package io.codelex.classesandobjects.practice.savingsaccount;

import java.math.BigDecimal;
import java.util.Scanner;

public class SavingsAccountTest {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BigDecimal input = new BigDecimal(0);

        System.out.print("How much money is in the account?: ");
        input = sc.nextBigDecimal();

        SavingsAccount JohnDoe = new SavingsAccount(input);

        System.out.print("Enter the annual interest rate: ");
        input = sc.nextBigDecimal();

        JohnDoe.setAnnualInterest(input);

        System.out.print("How long has the account been opened? ");
        input = sc.nextBigDecimal();

        JohnDoe.setMonthsAccOpened(input);

        System.out.print("Enter amount deposited for month: 1: ");
        input = sc.nextBigDecimal();

        JohnDoe.setDepositMoney(input);

        System.out.print("Enter amount withdrawn for 1: ");
        input = sc.nextBigDecimal();

        JohnDoe.setWithdraw(input);

        System.out.print("Enter amount deposited for month: 2: ");
        input = sc.nextBigDecimal();

        JohnDoe.setDepositMoney(input);

        System.out.print("Enter amount withdrawn for 2: ");
        input = sc.nextBigDecimal();

        JohnDoe.setWithdraw(input);

        System.out.print("Enter amount deposited for month: 3: ");
        input = sc.nextBigDecimal();

        JohnDoe.setDepositMoney(input);

        System.out.print("Enter amount withdrawn for 3: ");
        input = sc.nextBigDecimal();

        JohnDoe.setWithdraw(input);

        System.out.print("Enter amount deposited for month: 4: ");
        input = sc.nextBigDecimal();

        JohnDoe.setDepositMoney(input);

        System.out.print("Enter amount withdrawn for 4: ");
        input = sc.nextBigDecimal();

        JohnDoe.setWithdraw(input);

        JohnDoe.getTotalDeposited();
        JohnDoe.getTotalWithdrawn();
        JohnDoe.getInterestEarned();
        JohnDoe.getEndingBalance();


    }
}
