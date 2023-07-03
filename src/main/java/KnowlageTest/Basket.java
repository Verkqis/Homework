package KnowlageTest;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {

    private List<T> basket;

    public Basket() {
        this.basket = new ArrayList<>();
    }

    public void addToBasket(T item) throws BasketFullException {
        if (basket.size() == 10) {
            throw new BasketFullException();
        } else {
            basket.add(item);
        }
    }

    public void removeFromBasket(T item) throws BasketEmptyException {
        if (basket.isEmpty()) {
            throw new BasketEmptyException();
        }
        basket.remove(item);
    }

    public void printItems() {
        basket.forEach(System.out::println);
    }

}
