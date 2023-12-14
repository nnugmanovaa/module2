package classwork1;

import java.util.Scanner;

public class Main {

    public static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
//        Perosn person = new Perosn();
//        person.setName("Aruzhan");
//        person.setAge(45);
//        System.out.println(person.getName());
//        System.out.println(person.getAge());
//        /*--------------------------*/
//
//        Car car1 = new Car(123);
//        car1.start();
//        System.out.println(car1.asselerate(3));

        /*--------------------------*/

        Wallet wallet1 = new Wallet();
        wallet1.setBalance(0);
        InvestmentCalculator invest = new InvestmentCalculator(scanner.nextInt(), scanner.nextInt(), wallet1);
        int year = scanner.nextInt();

        System.out.println(invest.calculateEarnings(year));

    }
}
