import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String s="";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='x'){
                s+='a';
            } else if (ch=='y') {
                s+='b';
            }else if (ch=='z') {
                s+='c';
            }else{
                s+=(char)(ch+3);
            }

        }
        System.out.print(s);
    }
}
