package io.codelex.classesandobjects.practice.Product;

public class Product {

    private String name;
    private double price;
    private int amount;


    public Product(String name, double priceAtStart, int amountAtStart) {

        this.name = name;
        this.price = priceAtStart;
        this.amount = amountAtStart;

    }

    public void printProduct() {
        System.out.println(name + " price " + price + "," + " amount " + amount);
    }

    public void changeQuantity(int newQuantity) {
        amount = newQuantity;
    }

    public void changePrice(double newPrice) {
        price = newPrice;
    }

}
