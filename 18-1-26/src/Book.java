public class Book {
    static String libraryName = "City Library";

    String title;
    String author;
    final int isbn;

    public Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName() {
        System.out.println(libraryName);
    }

    public void display(Object obj) {
        if (obj instanceof Book) {
            System.out.println(title);
            System.out.println(author);
            System.out.println(isbn);
        }
    }

    public static void main(String[] args) {
        Book b = new Book("Java", "James", 123);
        displayLibraryName();
        b.display(b);
    }
}
