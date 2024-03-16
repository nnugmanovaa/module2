package module3.internet_shop;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password;

    private List<Product> basket;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        basket = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public List<Product> getBasket() {
        return basket;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", basket=" + basket +
                '}';
    }

    public void addToBasket(Product product) {
        basket.add(product);
    }
}
