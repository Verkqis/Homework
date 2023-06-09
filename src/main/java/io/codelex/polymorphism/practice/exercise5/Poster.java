package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {

    private String dimensions;
    private int numberOfCopies;
    private double costPerCopy;

    public Poster(int fee, String dimensions, int numberOfCopies, double costPerCopy) {
        super(fee);
        this.dimensions = dimensions;
        this.numberOfCopies = numberOfCopies;
        this.costPerCopy = costPerCopy;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    public double getCostPerCopy() {
        return costPerCopy;
    }

    public void setCostPerCopy(double costPerCopy) {
        this.costPerCopy = costPerCopy;
    }

    public double calculateCost() {
        return numberOfCopies * costPerCopy;
    }

    @Override
    public String toString() {
        return super.toString() + " Poster ad: Dimensions=" + dimensions +
                " Number of copies=" + numberOfCopies + " Cost per copy=" + costPerCopy;
    }
}
