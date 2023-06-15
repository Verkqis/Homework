package io.codelex.oop.summary;

public class ItemPacking implements Service {

    private static final String name = "Item packing";

    private static final Double price = 5.00;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public String getFullInfo() {
        return name + ", " + price + " EUR";
    }
}
