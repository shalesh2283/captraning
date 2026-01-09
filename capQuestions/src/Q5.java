import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        int secmax = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                secmax = max;
                max= arr[i];
            }else if (arr[i] >secmax && arr[i]!=max){
                secmax = arr[i];
            }
        }
        System.out.println(secmax);
    }
}
