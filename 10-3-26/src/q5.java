import java.util.*;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int []arr = new int[256];
        if(s1.length()!=s2.length()){
            System.out.println("no");
        }
        for(int i=0;i<s1.length();i++){
            arr[s1.charAt(i)]++;
            arr[s2.charAt(i)]--;
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1) {
                count++;
            }
        }
        if(count>0){
            System.out.println("no");
        }else {
            System.out.println("yes");
        }
    }
}
