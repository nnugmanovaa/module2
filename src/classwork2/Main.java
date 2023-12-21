package classwork2;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(10);
        Author author1 = new Author("John Doe", "USA");
        Book book1 = new Book("The Book Title", author1, 2022);
        Author author2 = new Author("Jane Smith", "UK");
        Book book2 = new Book("Another Title", author2, 2019);

        library.addBook(book1);
        library.addBook(book2);

        library.displayBooks();
    }
}
