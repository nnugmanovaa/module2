package collection1.task6;

import java.util.ArrayList;
import java.util.Iterator;

public class Student {
    private String name;
    private int course;
    private ArrayList<String> courseAtribute;
    public Student(String name, int course,ArrayList<String> courseAtribute){
        this.name = name;
        this.course = course;
        this.courseAtribute = courseAtribute;
    }

    public boolean addCourses(String courseName){
        return courseAtribute.add(courseName.toLowerCase());
    }

    public boolean removeCourse( String courseName){
        if (courseAtribute.isEmpty()) return false;
        for (String iterator : courseAtribute){
            if (iterator.equalsIgnoreCase(courseName)){
                courseAtribute.remove(courseName.toLowerCase());
                return true;
            }
        }
        return false;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public ArrayList<String> getCourseAtribute() {
        return courseAtribute;
    }

    public void setCourseAtribute(ArrayList<String> courseAtribute) {
        this.courseAtribute = courseAtribute;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                ", courseAtribute=" + courseAtribute +
                '}';
    }
}
