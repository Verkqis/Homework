package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

abstract class Animal {

    private String animalName;
    private String animalType;
    private double animalWeight;
    private int foodEaten;

    public Animal(String animalName, String animalType, double animalWeight) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
    }

    void makeSound() {

    }

    void eat(Food food) {

    }

    public String getAnimalName() {
        return animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public double getAnimalWeight() {
        return animalWeight;
    }

    public int getFoodEaten() {
        return foodEaten;
    }

    public void setFoodEaten(int foodEaten) {
        this.foodEaten = foodEaten;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return getClass().getSimpleName() + "[" + animalName + ", " + animalType + ", " + df.format(animalWeight) + ", "
                + foodEaten + "]";
    }
}
