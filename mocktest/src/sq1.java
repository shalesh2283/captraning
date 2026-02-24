import java.util.*;
public class sq1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String [] word = str.split(" ");
        StringBuilder sb=new StringBuilder();
        StringBuilder s=new StringBuilder();
        for(int i=0;i<word.length;i++){
            if(i%2!=0){
                sb.append(word[i]).reverse();
                s.append(sb);
                sb.setLength(0);
                s.append(" ");
            }else{
                s.append(word[i]);
                s.append(" ");
            }

        }
        System.out.println(s.toString());
    }
}
