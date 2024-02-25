package module2.task6.exs1;

public class Square extends Rectangle {

    // я не поняла как осздать геттеры и сетоеры перемнной sid, если мы ее не обьявляем
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, Boolean filled, double side) {
        super(color, filled, side, side);
    }

    public void setWidth(double side) {
        super.setWidth(side);
    }

    public void setLength(double side) {
        super.setLength(side);
    }

    public double getSide() {
        return super.getLength();
    }

    public void setSide(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
