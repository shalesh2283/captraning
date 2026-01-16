public class Book {
    String title;
    String author;
    double price;

    public Book() {
        title = "NA";
        author = "NA";
        price = 0;
    }

    public Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java", "James", 500);

        System.out.println(b1.title);
        System.out.println(b2.title);
    }
}