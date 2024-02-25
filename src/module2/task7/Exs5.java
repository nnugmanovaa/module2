package module2.task7;

import java.util.Scanner;

public class Exs5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(interpret(str));
    }

    public static String interpret(String command) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < command.length()) {
            if (command.charAt(i) == 'G') {
                result.append('G');
                i++;
            } else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                result.append('o');
                i += 2;
            } else if (command.charAt(i) == '(' && command.charAt(i + 1) == 'a' && command.charAt(i + 2) == 'l' && command.charAt(i + 3) == ')') {
                result.append("al");
                i += 4;
            }
        }
        return result.toString();
    }


}
