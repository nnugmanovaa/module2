package task3.exs9;

import task3.exs5.MyPoint;

public class TestMyRectangle {
    public static void main(String[] args) {
        MyRectangle myRectangle1 = new MyRectangle(3, 2, 4, 3);
        MyRectangle getMyRectangle2 = new MyRectangle(new MyPoint(3, 4), new MyPoint(4, 4));
        System.out.println(myRectangle1);
        myRectangle1.setBottomRightY(4);
        System.out.println(myRectangle1);
    }

}
