public class StringConcatenationDemo {

    public static void main(String[] args) {
        int n = 100000;

        long start, end;

        String s = "";
        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            s += "a";
        }
        end = System.nanoTime();
        System.out.println("String Time: " + (end - start) / 1e6 + " ms");

        StringBuilder sb = new StringBuilder();
        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
        end = System.nanoTime();
        System.out.println("StringBuilder Time: " + (end - start) / 1e6 + " ms");

        StringBuffer sbf = new StringBuffer();
        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sbf.append("a");
        }
        end = System.nanoTime();
        System.out.println("StringBuffer Time: " + (end - start) / 1e6 + " ms");
    }
}
