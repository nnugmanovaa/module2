package collection1.task1;

import java.security.PublicKey;

//Write a Java program to create a class called "Book"
// with attributes for title, author, and ISBN, and
// methods to add and remove books from a collection.
public class Book {
    private String title;
    private String author;
    private long ISBN;

    public Book(){
        title = null;
        author = null;
        ISBN = 0;
    }

    public Book (String title, String author, long ISBN){
        this.title  = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }
}
