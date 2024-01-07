package task3.exs8;

public class TestMyTriangle {
    public static void main(String[] args) {
        MyTriangle myTriangle = new MyTriangle(2,3,2,3,3,3);
        System.out.println(myTriangle.getPerimeter());
        System.out.println(myTriangle.getType());
        System.out.println(myTriangle.toString());
    }
}
