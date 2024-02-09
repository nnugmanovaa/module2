package task7;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Exs3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input");
        String jewels = scanner.nextLine();
        String stones = scanner.nextLine();
        if (jewels.length() < 1 || stones.length() > 50) System.out.println("Your number out of constants");
        System.out.println(numJewelsInStones(jewels, stones));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int result = 0;
        for (char stone : stones.toCharArray()) {
            if (jewels.indexOf(stone) != 0) {
                result++;
            }
        }
        return result;
    }
}
