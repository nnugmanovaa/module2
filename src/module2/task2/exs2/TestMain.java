package module2.task2.exs2;

public class TestMain {
    public static void main(String[] args) {
        // Test constructors and toString()
        Time t1 = new Time(1, 2, 3);
        System.out.println(t1);  // toString()

        // Test Setters and Getters
        t1.setHours(4);
        t1.setMinutes(5);
        t1.setSeconds(6);
        System.out.println(t1);  // toString()
        System.out.println("Hour: " + t1.getHours());
        System.out.println("Minute: " + t1.getMinutes());
        System.out.println("Second: " + t1.getSeconds());

        // Test setTime()
        t1.setTime(23, 59, 58);
        System.out.println(t1);  // toString()

        // Test nextSecond();
        System.out.println(t1.nextSecond());
        System.out.println(t1.nextSecond().nextSecond());

        // Test previousSecond()
        System.out.println(t1.previousSecond());
        System.out.println(t1.previousSecond().previousSecond());
    }
}
