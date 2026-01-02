package Level2;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int principle = sc.nextInt();
        int rate = sc.nextInt();
        int time = sc.nextInt();

        System.out.println("The SI is " + ((principle*rate*time)/100));
    }

}
