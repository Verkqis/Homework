package KnowlageTest;

public class DebitCard extends Card {


    private double balance;

    public DebitCard(String cardNumber, String fullName, int ccvCode) {
        super(cardNumber, fullName, ccvCode);
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public double widrawFounds(double balance) throws Exception {
        if (this.balance < balance) {
            throw new Exception("NotEnoughFundsException");
        }
        return this.balance--;
    }

    public double addFounds(double balance) {
        if (this.balance > 10000) {
            System.out.println("Warning: Too much money");
        }
        return this.balance++;
    }

}
