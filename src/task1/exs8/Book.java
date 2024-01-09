package task1.exs8;

public class Book {
    private String title;
    private int price;
    private String type;//может быть “Simple” или “Classical”
    private int sold;

    public Book(String title, int price, String type, int sold) {
        this.title = title;
        this.price = price;
        this.type = type;
        this.sold = sold;
    }


    public int calculateRevenue() {
        int revenue;
        if (sold <= 50) {
            if (type.equals("Classical")) {
                revenue = (int) (sold * price * 0.8);
            } else {
                revenue = sold * price;
            }
        } else {
            if (type.equals("Classical")) {
                revenue = (int) (50 * price * 0.8 + (sold - 50)* price);
            } else {
                revenue = (int) (50 * price + (sold - 50) * price * 1.2);
            }
        }
        return revenue;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }
}
