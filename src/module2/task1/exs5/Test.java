package module2.task1.exs5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        Candidate[] candidates = new Candidate[number];

        for ( int i =0; i< number; i++){
            String name = scanner.nextLine();
            String[] details = scanner.nextLine().split(" ");
            String work = details[0];
            int income = Integer.parseInt(details[1]);
            candidates[i]  = new Candidate(name, work, income);
        }

        for( Candidate candidate : candidates){
            if (candidate.passTheRules()){
                System.out.println(candidate);
            }
        }
    }
}
