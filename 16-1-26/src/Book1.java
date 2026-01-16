public class Book1 {
    String title;
    String author;
    double price;
    boolean available;

    public Book1(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
        available = true;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book Borrowed");
        } else {
            System.out.println("Not Available");
        }
    }

    public static void main(String[] args) {
        Book1 b = new Book1("Java", "James", 400);
        b.borrowBook();
    }
}
