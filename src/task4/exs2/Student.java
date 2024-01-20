package task4.exs2;

public class Student extends Person {
    private String programm;
    private int year;
    private double fee;

    public Student(String name, String adress, String programm, int year, double fee) {
        super(name, adress);
        this.programm = programm;
        this.year = year;
        this.fee = fee;
    }

    public String getProgramm() {
        return programm;
    }

    public void setProgramm(String programm) {
        this.programm = programm;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return String.format("Student [%s, programm = %s, year = %d, fee = %s]", super.toString(), programm, year, fee);
    }
}
