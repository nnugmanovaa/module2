package task6.exs5;

import task6.exs2.GeometricObject;

public class Circle implements GeometricObject {
    protected double radius;

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return String.format("Circle[ radius=%2f]", radius);
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}
