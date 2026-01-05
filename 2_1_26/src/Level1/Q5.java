package Level1;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("Yes you can vote");
        }else{
            System.out.println("No you are not eligible for voting");
        }
    }
}
