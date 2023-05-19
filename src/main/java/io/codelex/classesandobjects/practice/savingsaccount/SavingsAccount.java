package io.codelex.classesandobjects.practice.savingsaccount;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class SavingsAccount {
    DecimalFormat df = new DecimalFormat("####,##0.00");
    private BigDecimal balance;
    private BigDecimal withdraw = BigDecimal.ZERO;
    private BigDecimal deposit = BigDecimal.ZERO;
    private BigDecimal annualInterest = BigDecimal.ZERO;
    private BigDecimal accountOpened = BigDecimal.ZERO;

    public SavingsAccount(BigDecimal balance) {
        this.balance = balance;
    }

    public void setWithdraw(BigDecimal amount) {
        balance = balance.subtract(amount);
        withdraw = withdraw.add(amount);
    }

    public void setDepositMoney(BigDecimal amount) {
        balance = balance.add(amount);
        deposit = deposit.add(amount);
    }

    public void setMonthsAccOpened(BigDecimal acc) {
        accountOpened = acc;
    }

    public void setAnnualInterest(BigDecimal interest) {
        annualInterest = interest.multiply(BigDecimal.valueOf(0.01));
    }

    public BigDecimal getTotalDeposited() {
        System.out.println("Total deposited: " + df.format(deposit));
        return deposit;
    }

    public BigDecimal getTotalWithdrawn() {
        System.out.println("Total withdrawn: " + df.format(withdraw));
        return withdraw;
    }

    public BigDecimal getInterestEarned() {
        BigDecimal totalInterestEarned = balance.multiply(annualInterest).multiply(accountOpened);
        System.out.println("Interest earned: " + df.format(totalInterestEarned));
        return totalInterestEarned;
    }

    public BigDecimal getEndingBalance() {
        BigDecimal endingBalance = balance.add(getInterestEarned());
        System.out.println("Ending balance: " + df.format(endingBalance));
        return endingBalance;
    }
}
