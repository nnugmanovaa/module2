package collection1.task5;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.Period;
import java.util.Locale;

//Write a Java program to create a class called "Employee"
// with a name, salary, and hire date attributes, and a method to calculate years of service.
public class Employee {
    private String name;
    private int salary;
    private LocalDate hiredate;

    public Employee(String name, int salary, LocalDate hiredate) {
        this.name = name;
        this.salary = salary;
        this.hiredate = hiredate;
    }

    public void calculateYearOfService(){
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(hiredate, currentDate);
        System.out.printf("Years diffreent: %d, Mounth difference %d, Day difference: %d", period.getYears(), period.getMonths(), period.getDays());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getHiredate() {
        return hiredate;
    }

    public void setHiredate(LocalDate hiredate) {
        this.hiredate = hiredate;
    }
}
