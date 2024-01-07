package collection1.task4;

public class Main {
    public static void main(String[] args) {
        TrafficLight traffic1 = new TrafficLight(12);
        traffic1.changeColor();
        System.out.println(traffic1.getColor());
        System.out.println(traffic1.isYellow());
        System.out.println(traffic1.isGreen());
        System.out.println(traffic1.isRed());
    }
}
