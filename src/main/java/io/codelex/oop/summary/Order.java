package io.codelex.oop.summary;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;

public class Order {

    private List<SellableThing> listOfItems;

    public Order() {
        this.listOfItems = new ArrayList<>();
    }

    public void addItem(SellableThing item) {
        if (item == null) {
            throw new NullPointerException("WrongOrderException");
        } else if (item instanceof FoodItem) {
            FoodItem foodItem = (FoodItem) item;
            Date currentDate = new Date();
            if (foodItem.getBestBefore().before(currentDate)) {
                throw new InputMismatchException("BadFoodException");
            }
        }
        listOfItems.add(item);
    }

    public List<SellableThing> getItems() {
        return listOfItems;
    }


    public String itemList() {
        StringBuilder sb = new StringBuilder();
        String blank = " ";
        int nr = 1;
        for (SellableThing item : listOfItems) {
            String length = item.toString();
            sb.append("= " + nr).append(". ").append(item.getFullInfo()).append("=").append("\n");
            nr++;
        }
        return sb.toString();
    }


    //Order - class, should contain list of items,
    // should have method to add items and to return text that contains list of items

}
