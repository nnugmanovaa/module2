package module2.task7;

import java.util.Scanner;

public class Exs1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        String adress = new String(scanner.nextLine());
        String output = adress.replace(".", "[.]");
        System.out.println("Output: ");
        System.out.println(output);
    }
}
