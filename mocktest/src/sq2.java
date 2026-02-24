import java.util.*;
public class sq2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        boolean found=false;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            char ch1=str.charAt(str.length()-1);
            if(ch==ch1){
                found=true;
            }
        }
        String s="";
        if(found){
            s=str.substring(0, str.length()/2);
            System.out.print(s);
        }else{
            System.out.print("no");
        }
    }
}
