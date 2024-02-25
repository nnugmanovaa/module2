package module2.task6.exs1;

public class Test {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "red", false);  // Upcast Circle to Shape
        System.out.println(s1);// which version?
        System.out.println(s1.getArea());          // which version?
        System.out.println(s1.getPerimeter());     // which version?
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
//       System.out.println(s1.getRadius());// когда ты создаешь перемнную ссылочного типа класса Shape, ты можешь имспользоватть методы которые есть в классе Shape, специфические методы класса Circle он не видит

        Circle c1 = (Circle)s1;                   // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

//        you can not create an objject form abstract class
//        Shape s2 = new Shape();

        Shape s3 = new Rectangle( "red", false, 1.0, 2.0);   // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        //System.out.println(s3.getLength()); иззза  пермеены ссылочного типа shap мы не можем доттянутьтся до методов класса rectangle

        Rectangle r1 = (Rectangle)s3;   // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6);     // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        //System.out.println(s4.getSide());

// Take note that we downcast Shape s4 to Rectangle,
//  which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //System.out.println(r2.getSide());
        System.out.println(r2.getLength());

// Downcast Rectangle r2 to Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        //System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}
