package task6.exs5;

public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return String.format("ResizableCircle[%s]", super.toString());
    }

    @Override
    public void resize(int percent) {
        radius *= percent / 100;
    }
}
