package module2.task1.exs7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestCovernment {
    public static void main(String[] args) {
        int costTakenFromGovernment = 0;
        Scanner scanner = new Scanner(System.in);
        int budget = scanner.nextInt();
        String specType = scanner.next();
        int projSize = scanner.nextInt();
        City city = new City(budget, specType, projSize);
        scanner.nextLine();

        List <Project> projects = new ArrayList<>();

        for( int i =0; i < projSize; i++){
            String name = scanner.next();
            int cost = scanner.nextInt();
            String type = scanner.next();
            int isGovermental = scanner.nextInt();

            boolean isGovernmental = (isGovermental == 1);
            Project project = new Project(name, cost, type, isGovernmental);
            projects.add(project);

            if (isGovernmental){
                costTakenFromGovernment+=project.getCostWithDiscount(specType);
            } else{
                budget-= project.getCostWithDiscount(specType);
                if ( budget < 0){
                    costTakenFromGovernment+=Math.abs(budget);
                }
            }
        }

        System.out.println(costTakenFromGovernment);

    }
}
