package collection1.task6;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList <String> coursesnName = new ArrayList<>(Arrays.asList("math", "physcs"));
        Student st1 =  new Student("NN", 3, coursesnName);
        System.out.println(st1.toString());
        st1.addCourses("Language");
        System.out.println(st1.toString());
        st1.removeCourse("MATH");
        System.out.println(st1.toString());

    }
}
