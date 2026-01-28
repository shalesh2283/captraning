public class InventoryLinkedList {

    static class Node {
        int id, qty;
        String name;
        double price;
        Node next;

        Node(int id, String name, int qty, double price) {
            this.id = id;
            this.name = name;
            this.qty = qty;
            this.price = price;
        }
    }

    static Node head = null;

    static void addItem(int id, String name, int qty, double price) {
        Node n = new Node(id, name, qty, price);
        n.next = head;
        head = n;
    }

    static void totalValue() {
        double sum = 0;
        Node temp = head;
        while (temp != null) {
            sum += temp.qty * temp.price;
            temp = temp.next;
        }
        System.out.println("Total Value: " + sum);
    }

    public static void main(String[] args) {
        addItem(1, "Pen", 10, 5);
        addItem(2, "Book", 3, 100);
        totalValue();
    }
}
