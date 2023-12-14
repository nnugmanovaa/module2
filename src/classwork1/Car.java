package classwork1;

public class Car {
    private static int speed;

    public  int start(){
        return speed = 0;
    }

    public int asselerate(int increasse){
        speed+=increasse;
        return speed;
    }

    public Car(){}

    public Car(int speed){
        this.speed=speed;
    }

    public static int getSpeed() {
        return speed;
    }

    public static void setSpeed(int speed) {
        Car.speed = speed;
    }
}
