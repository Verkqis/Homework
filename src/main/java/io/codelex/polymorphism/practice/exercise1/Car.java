package io.codelex.polymorphism.practice.exercise1;

public interface Car {


    default Integer speedUp() {
        return null;
    }

    default void slowDown() {

    }

    default String showCurrentSpeed() {
        return null;
    }

    default void startEngine() {

    }

    default String getName() {
        return null;
    }


}
