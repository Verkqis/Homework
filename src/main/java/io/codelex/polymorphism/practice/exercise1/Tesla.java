package io.codelex.polymorphism.practice.exercise1;

public class Tesla implements Car {
    private Integer currentSpeed;
    private String name;

    public Tesla(String name) {
        this.name = name;
    }

    @Override
    public Integer speedUp() {
        return currentSpeed = 20;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 20;
    }

    @Override
    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    @Override
    public void startEngine() {
        System.out.println("-- silence ---");
    }

    @Override
    public String getName() {
        return name;
    }
}
