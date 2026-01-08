package Level1;

public class Q4 {

    public static void generateException() {
        String text = null;
        text.length();
    }

    public static void handleException() {
        String text = null;
        try {
            text.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled");
        }
    }

    public static void main(String[] args) {
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception generated");
        }

        handleException();
    }
}
