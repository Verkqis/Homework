package KnowlageTest;


import java.math.BigDecimal;

public class CardsApp {

    public static void main(String[] args) throws NotEnoughFundsException {

        Card first = new CreditCard("1234 4311 2354 1244", "John Doe", 666, new BigDecimal("666.66"));
        Card second = new DebitCard("1234 8765 2123 8888", "Jim Boo", 999, new BigDecimal("1111.11"));
        System.out.println(first.getBalance());
        System.out.println(second.getBalance());
        first.addFunds(new BigDecimal("333.33"));
        second.addFunds(new BigDecimal("222.22"));
        System.out.println(first.getBalance());
        System.out.println(second.getBalance());
        first.withdrawFunds(new BigDecimal("900.99"));
        second.withdrawFunds(new BigDecimal("1111.11"));
        System.out.println(first.getBalance());
        System.out.println(second.getBalance());
        second.addFunds(new BigDecimal("11111.11"));
        System.out.println(second.getBalance());
    }
}
