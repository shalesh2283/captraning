import java.util.ArrayList;

class Book {
    private String title;
    private String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void displayBook() {
        System.out.println(title + " by " + author);
    }
}

class Library {
    private String name;
    private ArrayList<Book> books = new ArrayList<>();

    Library(String name) {
        this.name = name;
    }

    void addBook(Book book) {
        books.add(book);
    }

    void displayLibraryBooks() {
        System.out.println("Library: " + name);
        for (Book b : books) {
            b.displayBook();
        }
    }
}

public class LibraryAggregationDemo {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James");
        Book b2 = new Book("Python Guide", "Guido");

        Library l1 = new Library("City Library");
        Library l2 = new Library("College Library");

        l1.addBook(b1);
        l2.addBook(b1);
        l2.addBook(b2);

        l1.displayLibraryBooks();
        l2.displayLibraryBooks();
    }
}
