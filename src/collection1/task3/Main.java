package collection1.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Nargiza", "Nugmanova", "madelxanova@mail.ru");
        Customer customer2 = new Customer("Aruzhan", "Nugmanova", "aruzhan@mail.ru");
        Author author1 = new Author(customer1, "USD", 123456L);
        Author author2 = new Author(customer2, "EUR", 123412356L);
        List <Author> authors = new ArrayList<>();
        authors.add(author1);
        authors.add(author2);
        Bank bank = new Bank(authors);
        bank.depositMoney("aruzhan@mail.ru", 400L);
        System.out.println(bank.toString());
    }

}
