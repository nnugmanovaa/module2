package module2.task1.exs4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        while (scanner.hasNext()){
            String name = scanner.nextLine();
            String author = scanner.nextLine();
            double price = scanner.nextDouble();
            String type = scanner.nextLine();
            Book book = new Book(name,author,price,type);
            book.calculatePriceRegardingThePrice();
            books.add(book);
        }

        for ( Book book : books){
            System.out.println(book);
        }
    }
}
