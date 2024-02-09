package task7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exs6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] sentences = new String[n];
        for (int i = 0; i < sentences.length; i++) {
            sentences[i] = scanner.nextLine();
        }
        System.out.println(mostWordsFound(sentences));

    }

    public static int mostWordsFound(String[] sentences) {
        List<Integer> result = new ArrayList<>();
        for (String sentence : sentences) {
            String[] wordsInSentence = sentence.split(" ");
            result.add(wordsInSentence.length);
        }
        return Collections.max(result);
    }
}
