package task1.exs2;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the number");
        int number = scanner.nextInt();

        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            String name = scanner.nextLine();
            String[] marks = scanner.nextLine().split(" ");
            int markMath = Integer.parseInt(marks[0]);
            int markEnglish = Integer.parseInt(marks[1]);
            int markProgramming = Integer.parseInt(marks[2]);

            students.add(new Student(name, markMath, markEnglish, markProgramming));
        }

        for (Student student : students) {
            double average = student.getTheAverageMark();
            if (average > 4) {
                System.out.printf("%s %.2f\n", student.getName(), average);
            }
        }

    }
}
