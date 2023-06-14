package KnowlageTest;

public abstract class Card {

    private String cardNumber;
    private String fullName;
    private int ccvCode;

    public Card(String cardNumber, String fullName, int ccvCode) {
        this.cardNumber = cardNumber;
        this.fullName = fullName;
        this.ccvCode = ccvCode;
    }
}
