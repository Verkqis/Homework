package io.codelex.oop.summary;

public class HouseholdItem extends AbstractItem {

    private String color;

    public HouseholdItem(String name, Double price, String color) {
        super(name, price);
        this.color = color;
    }

    @Override
    public String getFullInfo() {
        return getName() + ", " + getPrice() + " EUR, color: " + color;
    }


    //HouseholdItem - class, should extend AbstractItem, should also contain color (as text)
    //fullInfo method should return "{name}, {price} EUR, color: {color}", for example: "Bucket, 5.00 EUR, color: red"
    //constructor should receive name, price and color
}
