package module3.student_project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Mainn {
    public static void main(String[] args) {
        Student student1 = new Student("Oleg", "A", 3, Arrays.asList(2,5,5,5));
        Student student2 = new Student("Navat", "D", 2, Arrays.asList(2,4,4,5));
        Student student3 = new Student("Cristinna", "B", 4, Arrays.asList(3,4,4,4));

        List<Student> students = new ArrayList<>(){{
            add(student1);
            add(student2);
            add(student3);
        }
        };

        System.out.println(students);
        deleateStudentWithBadAcademicPerform(students);
        System.out.println("------------------");
        System.out.println(students);
        upgardeWithGoodAcademicPerformance(students);
        System.out.println("------------------");
        System.out.println(students);
        printStudents(students, 3);

    }

    public static void deleateStudentWithBadAcademicPerform(List<Student> students){
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if(student.calculateAverageGrade()<3.0){
                iterator.remove();
            }
        }
    }

    public static void upgardeWithGoodAcademicPerformance(List<Student> students){
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if(student.calculateAverageGrade()>= 3.0){
                student.setCourse(student.getCourse()+1);
            }
        }
    }
    public static void  printStudents(List<Student> students, int course){
        Iterator<Student> iterator = students.iterator();
        boolean found = false;
        while (iterator.hasNext()){
            Student student = iterator.next();
            if(student.getCourse() == course){
                System.out.println(student);
                found=true;
            }
        }
        if(!found){
            System.out.println("Нет ни одного студента на данном курсе"
            );
        }
    }
}
