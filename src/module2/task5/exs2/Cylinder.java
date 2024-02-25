package module2.task5.exs2;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder() {
        base = new Circle(); // Call the constructor to construct the Circle
        height = 1.0;
    }

    public Cylinder(Circle base, double height) {
        this.base = base;
        this.height = height;
    }

    public Cylinder(double radius, String coloor, double height) {
        base = new Circle(radius, coloor);
        this.height = height;
    }

    public Circle getBase() {
        return base;
    }

    public void setBase(Circle base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
