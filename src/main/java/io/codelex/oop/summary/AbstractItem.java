package io.codelex.oop.summary;

public abstract class AbstractItem implements Item {

    private String name;
    private Double price;


    public AbstractItem(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public abstract String getFullInfo();


    //AbstractItem - abstract class,
    // should implement Item interface and contain functionality
    // and variables that are common for all types of items
}
