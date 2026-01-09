import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine().toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch!='a'||ch!='e'||ch!='i'||ch!='o'||ch!='u'){
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}
