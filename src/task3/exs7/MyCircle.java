package task3.exs7;

import task3.exs5.MyPoint;

public class MyCircle {
    private MyPoint center;
    private int radius;

    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

    public double distance(MyCircle another){
        return this.center.distance(another.center);
    }

    public MyCircle(){
        center = new MyPoint(0,0);
        this.radius = 1;
    }

    public MyCircle(int x, int y, int radius){
        center = new MyPoint(x,y);
        this.radius = radius;
    }

    public MyCircle ( MyPoint center, int radius){
        this.center = center;
        this.radius = radius;
    }

    public int getRadius(){
        return this.radius;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }
    public int getCenterX(){
        return center.getX();
    }
    public void setCenterX ( int x ){
        this.center.setX(x);
    }

    public int getCenterY(){
        return center.getY();
    }
    public void setCenterY ( int y ){
        this.center.setY(y);
    }

    public int [] getCenterXY(){
        return new int[]{center.getX(), center.getY()};
    }

    public void setCenterXY(int x, int y){
        center.setXY(x,y);
    }

    @Override
    public String toString() {
        return String.format("MyCircle %d, center = %s", radius, center.toString() );
    }
}
