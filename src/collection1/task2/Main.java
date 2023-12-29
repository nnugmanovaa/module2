package collection1.task2;

public class Main {
    public static void main(String[] args) {
        Employee employee1  = new Employee("Nargiza", "Programmer", 1300.0);
        Employee employee2  = new Employee("Aruzhan", "Learning", 2300.0);
        Employee employee3  = new Employee("Sultan", "Data engineering", 3300.0);

        employee1.decreaseSalary(20);
        employee2.increaseSalary(13);

        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
        System.out.println(employee3.toString());

    }
}
