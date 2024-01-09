package task2.exs1;

public class Date {
    private int day;
    private int mounth;
    private int year;

    public Date(int day, int mounth, int year) {
        this.day = day;
        this.mounth = mounth;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMounth() {
        return mounth;
    }

    public void setMounth(int mounth) {
        this.mounth = mounth;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int mounth, int year){
        this.day = day;
        this.mounth = mounth;
        this.year = year;
    }

    @Override
    public String toString() {
        return  String.format("%02d/%02d/%04d", mounth, day, year);
    }
}
