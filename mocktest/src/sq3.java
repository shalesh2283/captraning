import java.util.*;
public class sq3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        StringBuilder sb =new StringBuilder();
        int n = Math.min(str1.length(), str2.length());
        for(int i = 0; i < n; i++){
            sb.append(str1.charAt(i));
            sb.append(str2.charAt(i));
        }


        sb.append(str1.substring(n));
        sb.append(str2.substring(n));
        System.out.print(sb.toString());
    }
}

