package io.codelex.polymorphism.practice.exercise6;

public class Cat extends Felime {

    private String breed;

    public Cat(String animalName, double animalWeight, String livingRegion, String breed) {
        super(animalName, "Cat", animalWeight, livingRegion);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void eat(Food food) {
        setFoodEaten(getFoodEaten() + food.getQuantity());
    }

    @Override
    public String toString() {
        return super.toString() + ", " + breed;
    }
}
