package task6.exs2;

import java.sql.SQLOutput;
import java.util.SortedMap;

public class Test {
    public static void main(String[] args) {
        GeometricObject g1 = new Circle(1.11);
        System.out.println(g1.getArea());
        System.out.println(g1);

        //GeometricObject g2 = (Rectangle)g1; // так делать нельзя, cast exseption
    }
}
