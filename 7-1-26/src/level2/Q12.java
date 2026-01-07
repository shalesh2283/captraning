package level2;

public class Q12 {
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + (int)(Math.random() * 9000);
        }
        return numbers;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;
        for (int n : numbers) {
            sum += n;
            if (n < min) min = n;
            if (n > max) max = n;
        }
        double average = sum / (double)numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        int[] numbers = generate4DigitRandomArray(5);
        System.out.print("Random numbers: ");
        for (int n : numbers) System.out.print(n + " ");
        System.out.println();

        double[] result = findAverageMinMax(numbers);
        System.out.println("Average = " + result[0]);
        System.out.println("Minimum = " + result[1]);
        System.out.println("Maximum = " + result[2]);
    }
}
