package io.codelex.oop.summary;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FoodItem extends AbstractItem {

    private Date bestBefore;

    FoodItem(String name, Double price, Date bestBefore) {
        super(name, price);
        this.bestBefore = bestBefore;
    }

    public Date getBestBefore() {
        return bestBefore;
    }

    @Override
    public String getFullInfo() {
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        return getName() + ", " + getPrice() + " EUR, best before: " + df.format(bestBefore);
    }


    //FoodItem - class, should extend AbstractItem, should also contain date of expiration
    //fullInfo method should return "{name}, {price} EUR, best before: {date of expiration}",
    // for example: "Milk, 0.75 EUR, best before: 01.04.2022"
    //constructor should receive name, price and bestBefore date
}
