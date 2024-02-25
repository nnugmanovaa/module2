package module2.task2.exs7;

public class Book {
    private String name;
    private Author[] author;
    private double price;
    private int qty;

    public Book(String name, Author[] author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public Book(String name, Author[] author, double price) {
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

    public Author[] getAuthor() {
        return author;
    }

    public void setAuthor(Author[] author) {
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

    @Override
    public String toString() {
        StringBuilder authorDetails = new StringBuilder();
        for (Author author1 : author) {
            authorDetails.append(author1.toString()).append(",");
        }

        return "Book[name=" + name + ", authors{" + authorDetails + "}, price=" + price + ", qty=" + qty + "]";

    }

    public String getAuthorNames(){
        StringBuilder authorsNames = new StringBuilder();
        for (int i = 0; i < author.length; i++) {
            authorsNames.append(author[i].getName());
            if (i < author.length - 1) {
                authorsNames.append(", ");
            }
        }
        return authorsNames.toString();
    }
}
