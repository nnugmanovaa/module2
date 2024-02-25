package module2.task2.exs5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestSchool {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int number = scanner.nextInt();
        int finalNumberOfAdmitedToSPecialSchool = 0;

        List<School> schools = new ArrayList<>();

        for(int i=0; i<number; i++){
            String title = scanner.next();
            String specType = scanner.next();
            int espCount =  scanner.nextInt();
            Esper[] espers = new Esper[espCount];

            for ( int j=0; j< espCount; j++){
                String titleEsper = scanner.next();
                int  mighty = scanner.nextInt();
                String type = scanner.next();

                Esper esper = new Esper(titleEsper,mighty,type);
                espers[j] = esper;
            }
            School school = new School(title, specType, espCount, espers);
            schools.add(school);
        }
        for (School school : schools){
            System.out.println(school.getTitle() + " - " + school.isPartOfTheSchool());
            finalNumberOfAdmitedToSPecialSchool += school.getSpecialSchool().getCount();
        }
        System.out.println("SpecialSchool - " + finalNumberOfAdmitedToSPecialSchool);



    }

}
