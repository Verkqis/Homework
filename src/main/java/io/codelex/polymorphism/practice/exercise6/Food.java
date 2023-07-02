package io.codelex.polymorphism.practice.exercise6;

abstract class Food {

    private int quantity;

    public Food(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

}
