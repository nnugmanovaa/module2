package collection1.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library {
    private List <Book> books;

    public Library(){
        this.books = new ArrayList<>();
    }

    public Library(List<Book> books) {
        this.books = books;
    }

    // method to add book to the library
    public void addBook (Book book){
        books.add(book);
        System.out.println("Book added sucesfully");
    }

    //method to delete the book from the library based on ISBN
    public void deleteBookByISBN(long ISBN){
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getISBN() ==ISBN) {
                iterator.remove();
                System.out.println("Book removed from the library by its ISBN: " + book.getISBN());
                return;
            }
        }
        System.out.println("Book with ISBN " + ISBN + " is not found in the library.");
    }

    public void deleteBookByTitle(String title){
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()){
            Book book = iterator.next();
            if (book.getTitle().equals(title)){
                iterator.remove();
                System.out.println("Book succsefully deleted by its title" + book.getTitle());
            }
        }
    }


    //method to display what we have in the Library
    public void displayAllBooks(){
        if (books.isEmpty()) {
            System.out.println("Yournlibrary is empty");
        }
        for ( Book b : books) {
            System.out.println(b);
        }
    }
    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
