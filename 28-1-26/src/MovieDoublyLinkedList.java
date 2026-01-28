public class MovieDoublyLinkedList {

    static class Node {
        String title, director;
        int year;
        double rating;
        Node prev, next;

        Node(String t, String d, int y, double r) {
            title = t;
            director = d;
            year = y;
            rating = r;
        }
    }

    static Node head = null, tail = null;

    static void addMovie(String t, String d, int y, double r) {
        Node n = new Node(t, d, y, r);
        if (head == null) {
            head = tail = n;
        } else {
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
    }

    static void removeByTitle(String title) {
        Node temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                if (temp.prev != null) temp.prev.next = temp.next;
                else head = temp.next;

                if (temp.next != null) temp.next.prev = temp.prev;
                else tail = temp.prev;
                return;
            }
            temp = temp.next;
        }
    }

    static void displayForward() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.title + " " + temp.director + " " + temp.rating);
            temp = temp.next;
        }
    }

    static void displayReverse() {
        Node temp = tail;
        while (temp != null) {
            System.out.println(temp.title + " " + temp.director + " " + temp.rating);
            temp = temp.prev;
        }
    }

    public static void main(String[] args) {
        addMovie("Inception", "Nolan", 2010, 9.0);
        addMovie("Avatar", "Cameron", 2009, 8.5);
        displayForward();
        displayReverse();
        removeByTitle("Avatar");
        displayForward();
    }
}
