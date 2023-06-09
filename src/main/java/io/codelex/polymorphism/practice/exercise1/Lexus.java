package io.codelex.polymorphism.practice.exercise1;

public class Lexus implements Car, Nitro {
    private Integer currentSpeed;
    private String name;

    public Lexus(String name) {
        this.name = name;
    }

    public Integer speedUp() {
        return currentSpeed = 8;
    }

    public void slowDown() {
        currentSpeed -= 8;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 30;
    }

    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }

    @Override
    public String getName() {
        return name;
    }
}
