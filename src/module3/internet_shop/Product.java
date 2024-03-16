package module3.internet_shop;

public class Product {
    private String name;
    private int price;
    private double raiting;

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", raiting=" + raiting +
                '}';
    }

    public Product(String name, int price, double raiting) {
        this.name = name;
        this.price = price;
        this.raiting = raiting;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getRaiting() {
        return raiting;
    }

    public void setRaiting(double raiting) {
        this.raiting = raiting;
    }

}
