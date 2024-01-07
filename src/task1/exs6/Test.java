package task1.exs6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numShips = scanner.nextInt();
        scanner.nextLine();

        List<Ship> ships = new ArrayList<>();

        for (int i = 0; i < numShips; i++) {
            String[] shipDetails = scanner.nextLine().split(" ");
            String name = shipDetails[0];
            String arrivalTime = shipDetails[1];
            int stayTime = Integer.parseInt(shipDetails[2]);
            int distress = Integer.parseInt(shipDetails[3]);

            boolean isDistress = (distress == 1);
            Ship ship = new Ship(name, arrivalTime, stayTime, isDistress);
            ships.add(ship);
        }

        List<Ship> allowedShips = new ArrayList<>();
        for (Ship ship : ships) {
            if (ship.canEnterThePort()) {
                allowedShips.add(ship);
            }
        }

        for (Ship ship : allowedShips) {
            System.out.println(ship);
        }
    }
}

