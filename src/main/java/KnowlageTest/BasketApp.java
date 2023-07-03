package KnowlageTest;

public class BasketApp {

    public static void main(String[] args) throws BasketFullException {

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
