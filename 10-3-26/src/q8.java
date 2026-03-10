import java.util.HashSet;
import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n=input.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=input.nextInt();
    }

    HashSet<Integer> set = new HashSet<>();
    for(int i = 0; i < arr.length; i++){
        set.add(arr[i]);
    }
    for(int c : set){
        System.out.print(c);
    }
}

}
