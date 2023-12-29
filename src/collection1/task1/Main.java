package collection1.task1;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Monkeys", "Killer Boing", 1234564354);
        Book book2 = new Book("Trickey", "Frozen King", 1234564356);
        Book book3 = new Book("Cokies", "Vanga Boing", 1234564357);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.displayAllBooks();
        library.deleteBookByISBN(1234564354);
        library.displayAllBooks();

    }

}
