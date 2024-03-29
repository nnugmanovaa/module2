package module2.task4.exs1;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height; // we made this to use to the overriden getArea, so we use this merhod fom the call Cicle becasue of super
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * getRadius() * height + 2 * Math.pow(getRadius(), 2);
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString()  // use Circle's toString()
                + " height=" + height;
    }
}

