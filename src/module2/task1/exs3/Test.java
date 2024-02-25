package module2.task1.exs3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();
        while (scanner.hasNext()) {
            String name = scanner.next();
            double averageMark = scanner.nextDouble();
            double scholarship = scanner.nextDouble();

            Student student = new Student(name, averageMark, scholarship);
            student.getCountedScolarchipDependingAverageMark();
            students.add(student);
        }

        for ( Student student : students){
            System.out.println(student);
        }
    }
}
