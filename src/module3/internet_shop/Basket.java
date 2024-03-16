package module3.internet_shop;

import java.util.Arrays;

public class Basket {
    private Product[] products;

    public Basket(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "products=" + Arrays.toString(products) +
                '}';
    }
}
