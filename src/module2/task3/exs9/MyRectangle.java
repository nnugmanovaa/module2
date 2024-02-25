package module2.task3.exs9;

import module2.task3.exs5.MyPoint;

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle(int x1, int y1, int x2, int y2) {
        topLeft = new MyPoint(x1, y1);
        bottomRight = new MyPoint(x2, y2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    public int getTopLeftX() {
        return topLeft.getX();
    }

    public void setTopLeftX(int x) {
        topLeft.setX(x);
    }

    public int getTopLeftY() {
        return topLeft.getY();
    }

    public void setTopLeftY(int y) {
        topLeft.setY(y);
    }

    public int getBottomRighttX() {
        return bottomRight.getX();
    }

    public void setBottomRightX(int x) {
        bottomRight.setX(x);
    }

    public int getBottomRighttY() {
        return topLeft.getY();
    }

    public void setBottomRightY(int y) {
        topLeft.setY(y);
    }

    @Override
    public String toString() {
        return String.format("MyRectangle[ topLeft(%d,%d), bottomRight (%d, $d)]", topLeft.getX(), topLeft.getY(),
                bottomRight.getX(), bottomRight.getY());
    }
}
