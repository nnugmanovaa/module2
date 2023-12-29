package collection1.task2;
//Write a Java program to create a class called "Employee"
// with a name, job title, and salary attributes, and methods to calculate and update salary.
public class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public Employee(){
        this.name = null;
        this.jobTitle = null;
        this.salary = 0.0;
    }

    public double increaseSalary(double persentage){
        return salary = salary + salary * persentage/100;
    }

    public double decreaseSalary(double persentage){
        return salary = salary - salary * persentage/100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
