package project2.entities.items;

import project2.utils.BorrowableItem;
import project2.enums.ItemType;
import project2.utils.PaperItem;

import java.io.Serializable;

public class Book  extends LibraryItem implements BorrowableItem, PaperItem, Serializable {
    private String author;
    private String title;
    private String isbn;

    public Book(){}
    public Book(int id, String name, boolean isAvailable, String author, String title, String isbn) {
        super(id, name, isAvailable, ItemType.BOOK);
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }

    //1;Little prince;true;BOOK;AAA_Author;Title_B;19191919;
    public String deserialize() {
        StringBuilder sb = new StringBuilder();
        sb.append(getId())
                .append(";")
                .append(getName())
                .append(";")
                .append(isAvailable())
                .append(";")
                .append(getItemType())
                .append(";")
                .append(getAuthor())
                .append(";")
                .append(getTitle())
                .append(";")
                .append(getIsbn())
                .append(";");
        return sb.toString();
    }

    @Override
    public String toString() {
        return super.toString() +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' + "\n";
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
