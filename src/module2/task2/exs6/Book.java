package module2.task2.exs6;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty;

    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorName(){
        return author.getName();
    }

    public void setAuthorName(String authorName){
        this.author.setName(authorName);
    }
    public String getAuthorEmail(){
        return author.getEmail();
    }

    public void setAuthorEmail(String authorEmail){
        this.author.setEmail(authorEmail);
    }

    public char getAuthorGender(){
        return author.getGender();
    }

    public void setAuthorGender(char authorGender){
        this.author.setGender(authorGender);
    }

    @Override
    public String toString() {
        return String.format("Book[ name = %s, %s", name, author.toString());
    }
}
