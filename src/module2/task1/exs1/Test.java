package module2.task1.exs1;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter the whole number of flights");
        int n = scanner.nextInt();
        ArrayList<Plane> planes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            planes.add(new Plane(parts[0], parts[1], parts[2]));
        }

        for (Plane plane : planes) {
            int flightTime = plane.calculateFlightTime();
            if (flightTime > 120) {
                System.out.println(plane.getId() + " " + plane.getArriva_time() + " " + plane.getLeave_time());
            }
        }
    }
}

