package classwork2;

public class Employee {

    private int id;
    private String firstname;
    private String lastname;
    private int salary;


    public Employee(int  id, String firstname, String lastname,int salary) {
        this.id = id;
        this.firstname=firstname;
        this.lastname=lastname;
        this.salary=salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String  getName() {
        return firstname + " " + lastname;
    }

    public int getAnualSalary() {
        return salary*12;
    }

    public int raiseSalary(int percent) {
        return salary = salary + (salary * percent / 100);
    }

    public String toString() {
        return "Employee [ id = " + id + " , name = " + firstname + " " + lastname + " salary = " + salary  + "] ";
    }
}
