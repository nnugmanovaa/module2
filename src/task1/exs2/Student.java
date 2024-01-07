package task1.exs2;

public class Student {
    private String name;
    private int Mark_math;
    private int Mark_english;
    private int Mark_programming;

    public Student(String name, int mark_math, int mark_english, int mark_programming) {
        this.name = name;
        Mark_math = mark_math;
        Mark_english = mark_english;
        Mark_programming = mark_programming;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark_math() {
        return Mark_math;
    }

    public void setMark_math(int mark_math) {
        Mark_math = mark_math;
    }

    public int getMark_english() {
        return Mark_english;
    }

    public void setMark_english(int mark_english) {
        Mark_english = mark_english;
    }

    public int getMark_programming() {
        return Mark_programming;
    }

    public void setMark_programming(int mark_programming) {
        Mark_programming = mark_programming;
    }

    public double getTheAverageMark() {
        return (Mark_english + Mark_math + Mark_programming) / 3;
    }
}
