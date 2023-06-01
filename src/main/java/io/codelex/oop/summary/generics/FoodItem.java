package io.codelex.oop.summary.generics;

public class FoodItem extends AbstractItem {

    private String bestBefore;

    public FoodItem(String name, double price, String bestBefore) {
        super(name, price);
        this.bestBefore = bestBefore;
    }

    @Override
    public String getFullInfo() {
        return getName() + ", " + getPrice() + " EUR, best before: " + bestBefore;
    }
}
