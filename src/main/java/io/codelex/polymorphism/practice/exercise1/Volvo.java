package io.codelex.polymorphism.practice.exercise1;

public class Volvo implements Car {

    private Integer currentSpeed;

    private String name;

    public Volvo(String name) {
        this.name = name;
    }

    @Override
    public Integer speedUp() {
        return currentSpeed = 8;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 8;
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
