package classwork2;

import java.util.ArrayList;

public class Library {
    private Book [] books;
    private int numOfBooks;

    public Library( int size){
        this.books = new Book[size];
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void addBook (Book book){
        if (numOfBooks < books.length) {
            books[numOfBooks] = book;
            numOfBooks++;
            System.out.println("Book added to the library.");
        } else {
            System.out.println("The library is full. Cannot add more books.");
        }
    }

    public void displayBooks(){
        if (numOfBooks == 0){
            System.out.println("There is nop book added to the library");
        } else {
            for (int i =0 ; i < numOfBooks; i++){
                System.out.println(books[i]);
            }
        }
//        for ( Book book: books){
//            System.out.println(book);
//        }
    }
    //    private ArrayList<Book> books = new ArrayList<>;
//
//    public ArrayList<Book> getBook() {
//        return books;
//    }
//
//    public void setBook(ArrayList<Book> books) {
//        this.books = books;
//    }
//
//    public void addBook (Book book){
//        books.add(book);
//        return;
//    }
//    public void displayBooks(){
//        System.out.println(books.toString());
//


}
