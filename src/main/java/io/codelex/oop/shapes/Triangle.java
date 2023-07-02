package io.codelex.oop.shapes;

public class Triangle extends Shape {

    private double width;
    private double height;

    public Triangle(double width, double height) {
        super(3);
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return 0.5 * width * height;
    }

    @Override
    public double getPerimeter() {
        double perimeter = width + height + height;
        return perimeter;
    }
}
