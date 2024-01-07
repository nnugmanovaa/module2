package collection1.task5;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employee person = new Employee("Nargiza", 130000, LocalDate.of (2022,3,12));
        person.calculateYearOfService();

    }
}
