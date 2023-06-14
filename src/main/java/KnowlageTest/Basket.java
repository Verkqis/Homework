package KnowlageTest;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {

    private T item;
    private Integer numberOfItems;

    private List<T> basket = new ArrayList<>();

    public Basket() {
        this.basket = new ArrayList<>();
    }

    public void addToBasket(T item) {
        if (basket.size() == 10) {
            throw new RuntimeException("BasketFullException");
        } else {
            basket.add(item);
        }
    }

    public void removeFromBasket(T item) {
        if (basket.isEmpty()) {
            throw new RuntimeException("BasketEmptyException");
        }
        basket.remove(item);
    }

    public void printItems() {
        basket.forEach(System.out::println);
    }
    
    public static void main(String[] args) {

        Apple first = new Apple();
        Apple second = new Apple();
        Apple third = new Apple();
        Apple forth = new Apple();
        Apple fifth = new Apple();
        Apple sixth = new Apple();
        Apple seventh = new Apple();
        Apple eight = new Apple();
        Apple ninth = new Apple();
        Apple ten = new Apple();
        Apple eleventh = new Apple();

        Basket<Apple> basketForApples = new Basket<>();
        basketForApples.addToBasket(first);
        basketForApples.addToBasket(second);
        basketForApples.addToBasket(third);
        basketForApples.addToBasket(forth);
        basketForApples.addToBasket(fifth);
        basketForApples.addToBasket(sixth);
        basketForApples.addToBasket(seventh);
        basketForApples.addToBasket(eight);
        basketForApples.addToBasket(ninth);
        basketForApples.addToBasket(ten);

        basketForApples.printItems();

        Mushroom firstM = new Mushroom();


    }

}