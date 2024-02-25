package module2.task1.exs8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Book> books = new ArrayList<>();

        for (int i =0; i< n; i++){
            String title = scanner.next();
            int price = scanner.nextInt();
            String type = scanner.next();
            int sold = scanner.nextInt();

            Book book = new Book(title, price, type, sold);
            books.add(book);
        }

        int totalRevenue = 0;
        for ( Book book : books){
            System.out.println(book.getTitle() + " " + book.calculateRevenue());
            totalRevenue+= book.calculateRevenue();
        }
        System.out.println( totalRevenue);
    }
}
