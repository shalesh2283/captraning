import java.util.*;

public class SortingPerformanceDemo {

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = 10000;
        Random r = new Random();

        int[] a1 = new int[n];
        int[] a2 = new int[n];
        int[] a3 = new int[n];

        for (int i = 0; i < n; i++) {
            int v = r.nextInt(n);
            a1[i] = a2[i] = a3[i] = v;
        }

        long start = System.nanoTime();
        bubbleSort(a1);
        long end = System.nanoTime();
        System.out.println("Bubble Sort: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        Arrays.sort(a2);
        end = System.nanoTime();
        System.out.println("Quick Sort (Arrays.sort): " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        Arrays.parallelSort(a3);
        end = System.nanoTime();
        System.out.println("Merge Sort (parallelSort): " + (end - start) / 1e6 + " ms");
    }
}
