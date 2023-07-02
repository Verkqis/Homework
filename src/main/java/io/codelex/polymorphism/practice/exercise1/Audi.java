package io.codelex.polymorphism.practice.exercise1;

public class Audi implements Car {
    private Integer currentSpeed;
    private String name;

    public Audi(String name) {
        this.name = name;
    }

    @Override
    public Integer speedUp() {
        return currentSpeed = 10;

    }

    @Override
    public void slowDown() {
        currentSpeed -= 10;
    }

    @Override
    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    @Override
    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }

    @Override
    public String getName() {
        return name;
    }
}
