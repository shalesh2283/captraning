import java.util.*;
public class sq4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0 )+1);
        }
        StringBuilder sb=new StringBuilder();
        for( Map.Entry<Character,Integer>value : map.entrySet()){
            sb.append(value.getKey());
            sb.append(value.getValue());
        }
        System.out.print(sb.toString());
    }
}
