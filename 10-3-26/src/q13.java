import java.util.Locale;
import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str=input.nextLine();
        int upper=0;
        int lower=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='A'&&ch<='Z'){
                upper++;
            }
            else if(ch>='a'&&ch<='z'){
                lower++;
            }
        }
        if(upper>lower){
            str=str.toUpperCase();
        }else{
            str=str.toLowerCase();
        }
        System.out.println(str);
    }
}
