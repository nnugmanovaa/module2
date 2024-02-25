package module2.task3.exs7;

public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle myCircle = new MyCircle(2,3,3);
        MyCircle another = new MyCircle(3,3,3);
        myCircle.distance(another);
        myCircle.getArea();
        myCircle.getCircumference();
        myCircle.toString();
    }
}
