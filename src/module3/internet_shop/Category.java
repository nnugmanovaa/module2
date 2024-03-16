package module3.internet_shop;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name;
    private List <Product> products;
    public Category() {
        name = "";
        products = new ArrayList<>(){{
            add(new Product("Milk", 120, 3.9));
            add(new Product("Bread", 32, 5.0));
            add(new Product("Jucy", 200, 3.1));
        }};
    }
    public Category(String name, List<Product> products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", products=" + products +
                '}';
    }
}
