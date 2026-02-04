import java.util.*;

abstract class Product {
    String name;
    double price;
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    abstract void display();
}

class Book extends Product {
    Book(String name, double price) {
        super(name, price);
    }
    void display() {
        System.out.println("Book: " + name + " " + price);
    }
}

class Clothing extends Product {
    Clothing(String name, double price) {
        super(name, price);
    }
    void display() {
        System.out.println("Clothing: " + name + " " + price);
    }
}

class Gadget extends Product {
    Gadget(String name, double price) {
        super(name, price);
    }
    void display() {
        System.out.println("Gadget: " + name + " " + price);
    }
}

class ProductCatalog<T extends Product> {
    List<T> products = new ArrayList<>();
    void addProduct(T p) {
        products.add(p);
    }
    void showProducts() {
        for (T p : products) {
            p.display();
        }
    }
}

public class DynamicOnlineMarketplace {
    public static <T extends Product> void applyDiscount(T p, double d) {
        p.price -= p.price * d / 100;
    }
    public static void main(String[] args) {
        ProductCatalog<Product> c = new ProductCatalog<>();

        Book b = new Book("Java", 500);
        Clothing cl = new Clothing("Shirt", 1000);
        Gadget g = new Gadget("Phone", 20000);

        applyDiscount(b, 10);
        applyDiscount(cl, 20);

        c.addProduct(b);
        c.addProduct(cl);
        c.addProduct(g);

        c.showProducts();
    }
}
