package io.codelex.oop.summary;

public class ElectronicsItem extends AbstractItem {

    private Integer powerInWatts;

    public ElectronicsItem(String name, Double price, Integer powerInWatts) {
        super(name, price);
        this.powerInWatts = powerInWatts;
    }

    @Override
    public String getFullInfo() {
        return getName() + ", " + getPrice() + " EUR, power: " + powerInWatts + "W";
    }


    //ElectronicsItem - class, should extend AbstractItem, should also contain power in watts (W)
    //fullInfo method should return "{name}, {price} EUR, power: {power}W", for example: "Radio, 25.00 EUR, power: 100W"
    //constructor should receive name, price and power
}
