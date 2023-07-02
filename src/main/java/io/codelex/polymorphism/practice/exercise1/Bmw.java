package io.codelex.polymorphism.practice.exercise1;

public class Bmw implements Car {

    private Integer currentSpeed;
    private String name;

    public Bmw(String name) {
        this.name = name;
    }

    @Override
    public Integer speedUp() {
        return currentSpeed = 12;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 12;
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
