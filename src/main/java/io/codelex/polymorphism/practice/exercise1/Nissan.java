package io.codelex.polymorphism.practice.exercise1;

public class Nissan implements Car, Nitro {

    private Integer currentSpeed;
    private String name;

    public Nissan(String name) {
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
    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 30;
    }

    @Override
    public String getName() {
        return name;
    }
}
