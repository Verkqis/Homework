package KnowlageTest;

public class CreditCard extends Card {

    private double balance;

    public CreditCard(String cardNumber, String fullName, int ccvCode) {
        super(cardNumber, fullName, ccvCode);
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public double widrawFounds(double balance) throws Exception {
        if (this.balance <= 100) {
            System.out.println("Warning: Low funds");
        } else if (this.balance < balance) {
            throw new Exception("NotEnoughFundsException");
        }
        return this.balance--;
    }

    public double addFounds(double balance) {
        return this.balance++;
    }

}
