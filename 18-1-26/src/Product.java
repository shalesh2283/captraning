public class Product {
    static double discount = 10;

    String productName;
    double price;
    int quantity;
    final int productID;

    public Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    public static void updateDiscount(double d) {
        discount = d;
    }

    public void display(Object obj) {
        if (obj instanceof Product) {
            System.out.println(productName);
            System.out.println(price);
            System.out.println(quantity);
            System.out.println(discount);
        }
    }

    public static void main(String[] args) {
        Product p = new Product("Pen", 10, 5, 501);
        updateDiscount(15);
        p.display(p);
    }
}
