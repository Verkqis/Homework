package KnowlageTest;

import java.math.BigDecimal;

public class DebitCard extends Card {

    public DebitCard(String cardNumber, String fullName, int ccvCode, BigDecimal balance) {
        super(cardNumber, fullName, ccvCode, balance);
    }
}
