package KnowlageTest;

public class BasketEmptyException extends Exception {

    public BasketEmptyException() {
        System.out.println("Error: Basket is empty can't remove item from empty basket! ");
    }
}
