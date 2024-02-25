package module2.task1.exs4;

public class Book {
    private String name;
    private String author;

    private double price;
    private String type;

    public void calculatePriceRegardingThePrice(){
        switch (type) {
            case ("Classical"):
                this.price -= (price * 0.1);
                break;
            case ("Bestseller"):
                this.price += (price * 0.2);
                break;
            default:
                break;
        }
    }

    public Book(String name, String author, double price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
