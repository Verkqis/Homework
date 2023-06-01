package io.codelex.oop.shapes;

public abstract class Shape {
    protected int numSides;

    public Shape(int numSides) {
        this.numSides = numSides;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
