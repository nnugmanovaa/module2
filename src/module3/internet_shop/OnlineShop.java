package module3.internet_shop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OnlineShop {
    private List<Category> categories;
    private List<User> users;
    private Scanner scanner;

    public OnlineShop() {
        categories = new ArrayList<>();
        users = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addCategory(Category category) {
        categories.add(category);
    }

    public void registerUser(User user) {
        users.add(user);
    }

    public void authenticateUser() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                System.out.println("Authentication successful!");
                return;
            }
        }
        System.out.println("Authentication failed. Invalid username or password.");
    }

    public void displayCategories() {
        System.out.println("Available categories:");
        for (Category category : categories) {
            System.out.println(category.getName());
        }
    }

    public void displayProductsInCategory(String categoryName) {
        for (Category category : categories) {
            if (category.getName().equals(categoryName)) {
                System.out.println("Products in category " + categoryName + ":");
                for (Product product : category.getProducts()) {
                    System.out.println(product.getName() + " - Price: $" + product.getPrice() + " - Rating: " + product.getRaiting());
                }
                return;
            }
        }
        System.out.println("Category not found.");
    }

    public void addToBasket(User user, String productName) {
        for (Category category : categories) {
            for (Product product : category.getProducts()) {
                if (product.getName().equals(productName)) {
                    user.addToBasket(product);
                    System.out.println(productName + " added to basket.");
                    return;
                }
            }
        }
        System.out.println("Product not found.");
    }

    public void displayBasket(User user) {
        List<Product> basket = user.getBasket();
        if (basket.isEmpty()) {
            System.out.println("Your basket is empty.");
        } else {
            System.out.println("Your basket:");
            for (Product product : basket) {
                System.out.println(product.getName() + " - Price: $" + product.getPrice() + " - Rating: " + product.getRaiting()
                );
            }
        }
    }
    public static void main(String[] args) {
        OnlineShop shop = new OnlineShop();

        // Создаем товары
        List<Product> electronics = new ArrayList<>();
        electronics.add(new Product("Phone", 500, 4));
        electronics.add(new Product("Laptop", 1000, 5));
        Category electronicsCategory = new Category("Electronics", electronics);

        List<Product> clothing = new ArrayList<>();
        clothing.add(new Product("T-Shirt", 20, 3));
        clothing.add(new Product("Jeans", 50, 4));
        Category clothingCategory = new Category("Clothing", clothing);

        shop.addCategory(electronicsCategory);
        shop.addCategory(clothingCategory);

        // Создаем пользователей
        User user1 = new User("user1", "password1");
        User user2 = new User("user2", "password2");

        shop.registerUser(user1);
        shop.registerUser(user2);

        // Пример использования
        System.out.println("Welcome to the Online Shop!");

        // Аутентификация пользователя
        shop.authenticateUser();

        // Просмотр списка категорий товаров
        shop.displayCategories();

        // Просмотр списка товаров определенного каталога
        shop.displayProductsInCategory("Electronics");

        // Выбор товара в корзину
        shop.addToBasket(user1, "Phone");
        shop.addToBasket(user1, "Jeans");

        // Покупка товаров, находящихся в корзине
        shop.displayBasket(user1);

    }
}
