package Level1;

import java.util.Scanner;

public class Q1 {
    public static boolean equal(String a, String b) {
        int c=a.length()-1;
        int d=b.length()-1;
        if(c!=d){
            return false;
        }
        for(int i=0;i<c;i++){
            if(a.charAt(i)!=b.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String a=sc.nextLine();
        System.out.println(equal(str,a));
    }
}
