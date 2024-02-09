package task7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exs4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] stringArray = new String[n];
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = scanner.nextLine();
        }
        char x = scanner.next().charAt(0);
        System.out.println(Arrays.toString(findWordsContaining(stringArray, x)));

    }

    public static int[] findWordsContaining(String[] words, char x) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                resultList.add(i);
            }
        }

        // Convert the list to an array
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }
}
