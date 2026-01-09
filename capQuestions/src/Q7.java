import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        boolean [] bool = new boolean[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z'){
                bool[ch-'a'] = true;
            }
        }
       boolean ispal=true;
        for(int i=0;i<s.length();i++){
            if(!bool[i]){
                ispal=false;
            }
        }
        if(ispal){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
