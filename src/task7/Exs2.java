package task7;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Exs2 {
    public static void main(String[] args) {
        System.out.println(countTheResultAfterOpertaions(initializeTheArray()));
    }

    public static String[] initializeTheArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of operations:");
        int number = scanner.nextInt();
        scanner.nextLine();
        String[] stringArray = new String[number];
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = scanner.nextLine();
        }
        return stringArray;
    }

    public static int countTheResultAfterOpertaions(String[] array) {
        int finalResult = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains("--")) {
                finalResult--;
            } else if (array[i].contains("++")) {
                finalResult++;
            }
        }
        return finalResult;
    }
}
