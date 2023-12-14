package classwork2;

public class Rectangle {

    private static float lenght;
    private static float width;

    public Rectangle(){
        this.lenght = 1.0f;
        this.width = 1.0f;
    }

    public Rectangle( float lenght, float width){
        this.lenght=lenght;
        this.width=width;
    }

    public static float getLenght() {
        return lenght;
    }

    public static void setLenght(float lenght) {
        Rectangle.lenght = lenght;
    }

    public static float getWidth() {
        return width;
    }

    public static void setWidth(float width) {
        Rectangle.width = width;
    }

    public static double getArea(){
        return lenght * width;
    }

    public static double getPerimetre(){
        return 2 * (lenght + width);
    }

    public String toString(){
        return "Rectangle [leght = " + lenght + " , width" + width +"]";
    }

}
