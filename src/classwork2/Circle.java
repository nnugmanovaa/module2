package classwork2;

import classwork1.Main;
import classwork1.Perosn;

public class Circle {
    private static double radius =1.0;

    public Circle(){}
    public Circle ( double r){
        radius=r;
    }

    public static double getRadius() {
        return radius;
    }

    public static double getArea(){
        return Math.PI * radius*radius;
    }

    public static double getCircumference(){
        return 2 * Math.PI * radius;
    }

    public String toString(){
        return "Cicle[radius = " + radius +" ]";
    }

    public static void setRadius(double radius) {
        Circle.radius = radius;
    }
}
