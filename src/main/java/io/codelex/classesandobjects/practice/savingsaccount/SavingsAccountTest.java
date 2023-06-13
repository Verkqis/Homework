package io.codelex.classesandobjects.practice.savingsaccount;

import java.math.BigDecimal;
import java.util.Scanner;

public class SavingsAccountTest {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BigDecimal input;

        System.out.print("How much money is in the account?: ");
        input = sc.nextBigDecimal();

        SavingsAccount johnDoe = new SavingsAccount(input);

        System.out.print("Enter the annual interest rate: ");
        input = sc.nextBigDecimal();

        johnDoe.setAnnualInterest(input);

        System.out.print("How long has the account been opened? ");
        input = sc.nextBigDecimal();

        johnDoe.setMonthsAccOpened(input);

        System.out.print("Enter amount deposited for month: 1: ");
        input = sc.nextBigDecimal();

        johnDoe.setDepositMoney(input);

        System.out.print("Enter amount withdrawn for 1: ");
        input = sc.nextBigDecimal();

        johnDoe.setWithdraw(input);

        System.out.print("Enter amount deposited for month: 2: ");
        input = sc.nextBigDecimal();

        johnDoe.setDepositMoney(input);

        System.out.print("Enter amount withdrawn for 2: ");
        input = sc.nextBigDecimal();

        johnDoe.setWithdraw(input);

        System.out.print("Enter amount deposited for month: 3: ");
        input = sc.nextBigDecimal();

        johnDoe.setDepositMoney(input);

        System.out.print("Enter amount withdrawn for 3: ");
        input = sc.nextBigDecimal();

        johnDoe.setWithdraw(input);

        System.out.print("Enter amount deposited for month: 4: ");
        input = sc.nextBigDecimal();

        johnDoe.setDepositMoney(input);

        System.out.print("Enter amount withdrawn for 4: ");
        input = sc.nextBigDecimal();

        johnDoe.setWithdraw(input);

        johnDoe.getTotalDeposited();
        johnDoe.getTotalWithdrawn();
        johnDoe.getInterestEarned();
        johnDoe.getEndingBalance();


    }
}
