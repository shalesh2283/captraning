import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String[] arr = s.split("0");
        String a="";

        for(int i=0;i<arr.length;i++){
            if(arr[i].length()==0) continue;
            int count = arr[i].length();
            char r = (char)(count + 64);
            a += r;
        }

        System.out.println(a);
    }

}
