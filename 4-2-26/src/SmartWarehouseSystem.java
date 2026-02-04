import java.util.*;

abstract class WarehouseItem {
    String name;
    WarehouseItem(String name) {
        this.name = name;
    }
    abstract void display();
}

class Electronics extends WarehouseItem {
    Electronics(String name) {
        super(name);
    }
    public void display() {
        System.out.println("Electronics Item: " + name);
    }
}

class Groceries extends WarehouseItem {
    Groceries(String name) {
        super(name);
    }
    public void display() {
        System.out.println("Grocery Item: " + name);
    }
}

class Furniture extends WarehouseItem {
    Furniture(String name) {
        super(name);
    }
    public void display() {
        System.out.println("Furniture Item: " + name);
    }
}

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();
    public void addItem(T item) {
        items.add(item);
    }
    public List<T> getItems() {
        return items;
    }
}

public class SmartWarehouseSystem {
    public static void displayAllItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            item.display();
        }
    }
    public static void main(String[] args) {
        Storage<Electronics> e = new Storage<>();
        e.addItem(new Electronics("Laptop"));
        e.addItem(new Electronics("Mobile"));

        Storage<Groceries> g = new Storage<>();
        g.addItem(new Groceries("Rice"));
        g.addItem(new Groceries("Milk"));

        displayAllItems(e.getItems());
        displayAllItems(g.getItems());
    }
}
