import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i =arr.length-1;i>=0;i--) {
            sb.append(arr[i]+" ");
        }
        System.out.println(sb.toString());
    }
}
