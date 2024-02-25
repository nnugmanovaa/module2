package module2.task1.exs3;

public class Student {
    private String name;
    private double averageMark;
    private double scolarship;

    public void getCountedScolarchipDependingAverageMark() {
        if (this.averageMark > 4.5) {
            this.scolarship *= 1.3;
        } else if (this.averageMark < 2) {
            return;
        } else {
            this.scolarship *= 1.1;
        }
    }

    public Student(String name, double averageMark, double scolarship) {
        this.name = name;
        this.averageMark = averageMark;
        this.scolarship = scolarship;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public double getScolarship() {
        return scolarship;
    }

    public void setScolarship(double scolarship) {
        this.scolarship = scolarship;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", averageMark=" + averageMark +
                ", scolarship=" + scolarship +
                '}';
    }
}
