package KnowlageTest;

import java.math.BigDecimal;

public abstract class Card {

    private String cardNumber;
    private String fullName;
    private int ccvCode;
    private BigDecimal balance;

    public Card(String cardNumber, String fullName, int ccvCode, BigDecimal balance) {
        this.cardNumber = cardNumber;
        this.fullName = fullName;
        this.ccvCode = ccvCode;
        this.balance = balance;
    }

    public void addFunds(BigDecimal amount) {
        balance = balance.add(amount);
        if (this instanceof DebitCard && balance.compareTo(BigDecimal.valueOf(10000)) > 0) {
            System.out.println("Warning: Too much money");
        }
    }

    public void withdrawFunds(BigDecimal amount) throws NotEnoughFundsException {
        if (balance.compareTo(amount) < 0) {
            throw new NotEnoughFundsException();
        }
        balance = balance.subtract(amount);
        if (this instanceof CreditCard && balance.compareTo(BigDecimal.valueOf(100)) < 0) {
            System.out.println("Warning: Low funds");
        }
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public int getCcvCode() {
        return ccvCode;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }


//    Both cards should have methods to add money and to take money and both cards should throw NotEnoughFundsException
//if its not possible to take out the amount you are requesting
//
//    Difference between cards:
//            * Credit card should print out "Warning: Low funds" every time when you take money from credit card and money left in the card is less than 100
//            * Debit card should print out "Warning: Too much money" every time when you add money and the money in the card is more than 10 000
//
//    Create three classes - abstract class Card and regular classes CreditCard, DebitCard that will extend the abstract class.
//    Decide what should be in parent class and what should be in child classes.
}
