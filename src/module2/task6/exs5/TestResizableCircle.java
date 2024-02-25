package module2.task6.exs5;

public class TestResizableCircle {
    public static void main(String[] args) {
        ResizableCircle r = new ResizableCircle(10);
        System.out.println(r);
        r.resize(10);
        System.out.println(r.getArea());

        Circle r2 = new ResizableCircle(11);
        System.out.println(r2);
    }
}
